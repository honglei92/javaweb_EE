package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doc.db.UserDao;

public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DeleteUserServlet() {
		super();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		response.setContentType("GBK");
		
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
        ServletContext ctx=this.getServletContext();
        String server =ctx.getInitParameter("server");
		String dbname =ctx.getInitParameter("dbname");
		String dbuser =ctx.getInitParameter("dbuser");
		String pwd =ctx.getInitParameter("pwd");
		UserDao dao=new UserDao();
			try
			{
				dao.getConn(server, dbname, dbuser, pwd);
				dao.delUserById(id);
				response.sendRedirect("quanxian.jsp");
			}catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

