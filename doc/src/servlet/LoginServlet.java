package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.haiersoft.db.DBOper;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void destroy(){
		super.destroy();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		
		String valcode=request.getParameter("Valcode");
		System.out.println("valcode="+valcode);
		HttpSession session=request.getSession();
		String randomImageStr=(String)session.getAttribute("randomString");
		System.out.println("rand="+randomImageStr);
		
		if(valcode!=null){
			if(valcode.toUpperCase().equals(randomImageStr)){
				out.println("验证码正确");
				
				String username=request.getParameter("username");
				System.out.println("username="+username);
				String userpass=request.getParameter("password");
				ServletContext ctx=this.getServletContext();
				String server=ctx.getInitParameter("server");
				String dbname=ctx.getInitParameter("dbname");
				String user=ctx.getInitParameter("user");
				String pwd=ctx.getInitParameter("pwd");
				DBOper db=new DBOper();
					try{
						db.getConn(server, dbname, user, pwd);
						String sql="SELECT username,userpass,role FROM userdetail WHERE username=? AND userpass=?";
						ResultSet rs=db.executeQuery(sql, new String[]{username,userpass});
						if(rs!=null&&rs.next()){
							
							session.setAttribute("username", username);
							SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
							String logtime=dateFormat.format(new Date());
							session.setAttribute("logtime", logtime);
							username=URLEncoder.encode(username,"GBK");
							Cookie cookie = new Cookie("username", username);
							cookie.setMaxAge(60*60*24*30);
							response.addCookie(cookie);
							RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
							dispatcher.forward(request, response);
						}else{
							out.println("登录失败");
							out.println("<br><a href='login.html'>重新登录</a>");
						}
					}catch (ClassNotFoundException e){
						e.printStackTrace();
					}catch(Exception e){
				e.printStackTrace();
			}
			}else{
				out.print("验证码输入错误");
				out.print("<br><a href='login.html'>请重新登录</a>");
	    }
		}
		}
		public void init() throws ServletException{}
		
}
