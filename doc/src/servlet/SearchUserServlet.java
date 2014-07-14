package servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doc.db.UserDao;
import com.doc.entity.User;

public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SearchUserServlet() {
		super();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
      doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        request.setCharacterEncoding("GBK");
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
		String username=request.getParameter("username");
		
		System.out.println(username);
		
		ServletContext ctx=this.getServletContext();
		String server=ctx.getInitParameter("server");
		String dbname=ctx.getInitParameter("dbname");
		String user=ctx.getInitParameter("user");
		String pwd=ctx.getInitParameter("pwd");
		UserDao dao=new UserDao();
		List<User> userlist=null;
		try{
			dao.getConn(server, dbname, user, pwd);
			if(username!=null&&username.length()>0){
				userlist=dao.getUserByName(username);
			}else{
				userlist=dao.getAllUser();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		if (userlist!=null){
			request.setAttribute("userList", userlist);
		}
		request.getRequestDispatcher("quanxian.jsp").forward(request,response);
	}
}
