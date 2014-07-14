package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haiersoft.db.DBOper;
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public AddUserServlet() {
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
		String userpass=request.getParameter("userpass");
		String role=request.getParameter("role");
		
		Date curTime=new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String regtime=dateFormat.format(curTime);
		ServletContext ctx=this.getServletContext();
		String server =ctx.getInitParameter("server");
		String dbname =ctx.getInitParameter("dbname");
		String dbuser =ctx.getInitParameter("dbuser");
		String pwd =ctx.getInitParameter("pwd");
		DBOper db= new DBOper();{
		try{
			db.getConn(server, dbname, dbuser, pwd);
			String sql="INSERT INTO userdetail(username,userpass,role,logtime)values(?,?,?,?)";
			int rs=db.executeUpdate(sql, new String[]{username,userpass,role,regtime});
			if(rs>0){
				out.println("添加成功");
				out.println("<br><a href='quanxian.jsp'>返回</a>");
			}else{
				out.println("添加新用户失败！");
				out.println("<br><a href='addUser.jsp'>返回</a>");
			}
		}catch(ClassNotFoundException e){
           e.printStackTrace();			
		}catch(Exception e){
		      e.printStackTrace();
		}
	}
	}
}
