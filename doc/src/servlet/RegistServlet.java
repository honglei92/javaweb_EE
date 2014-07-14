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
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		String ip = getRemoteAddress(request);
		System.out.println(ip);
		
		DBOper db=new DBOper();
		try{
			db.getConn(server, dbname, user, pwd);
			String sql="INSERT INTO userdetail(username,userpass,regtime,ip)values(?,?,?,?)";
			Date curTime=new Date();
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String regtime=dateFormat.format(curTime);
			
			
			int rs=db.executeUpdate(sql, new String[] {username,userpass,regtime,ip});
			if(rs>0){
				out.println("注册成功！请记住您的用户名和密码");
				out.println("<br><a href='index.jsp'>请登录</a>");
			}else{
				out.println("注册失败");
				out.println("<br><a href='regist.jsp'>重新注册</a>");
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getRemoteAddress(HttpServletRequest request) {
	      String ip = request.getHeader("x-forwarded-for");  
	        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {  
	            ip = request.getHeader("Proxy-Client-IP");  
	        }  
	        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {  
	            ip = request.getHeader("WL-Proxy-Client-IP");  
	        }  
	        if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {  
	            ip = request.getRemoteAddr();  
	        }  
	        return ip;  
	    }  
	}

