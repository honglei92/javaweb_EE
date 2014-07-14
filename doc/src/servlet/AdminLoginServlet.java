package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.haiersoft.db.DBOper;
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 9171218638215078516L;
	public AdminLoginServlet() {
		super();
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
        
		String username=request.getParameter("username");
		String userpass=request.getParameter("password");
		ServletContext ctx=this.getServletContext();
		String server=ctx.getInitParameter("server");
		String dbname=ctx.getInitParameter("dbname");
		String user=ctx.getInitParameter("user");
		String pwd=ctx.getInitParameter("pwd");
		DBOper db=new DBOper();
			try{
				db.getConn(server, dbname, user, pwd);
				String sql="SELECT username,userpass,role FROM userdetail WHERE username=?" +
						" AND userpass=? AND role=1";
				ResultSet rs=db.executeQuery(sql, new String[]{username,userpass});
				if(rs!=null&&rs.next()){
					HttpSession session=request.getSession();
					session.setAttribute("username", username);
					SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					String logtime=dateFormat.format(new Date());
					session.setAttribute("logtime", logtime);
					response.sendRedirect("adminMain.jsp");
				}else{
					out.println("µÇÂ¼Ê§°Ü£¡");
					out.println("<br><a href='adminLogin.jsp'>ÖØÐÂµÇÂ¼</a>");
				}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}
