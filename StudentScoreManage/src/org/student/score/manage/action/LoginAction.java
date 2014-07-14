package org.student.score.manage.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.student.score.manage.model.LoginInfo;
import org.student.score.manage.model.NewsInfo;
import org.student.score.manage.service.LoginInfoService;
import org.student.score.manage.service.NewsInfoService;
import org.student.score.manage.service.StudentInfoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 摇滚轮回
 * @param <LoginService>
 * @param sid
 *            学号
 * @param password
 *            密码
 * 
 */

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private LoginInfo loginInfo;
	private StudentInfoService studntLogin;
	private LoginInfoService login;
	private NewsInfoService news;
	private NewsInfo newsInfo;

	public NewsInfo getNewsInfo() {
		return newsInfo;
	}

	public void setNewsInfo(NewsInfo newsInfo) {
		this.newsInfo = newsInfo;
	}

	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	public NewsInfoService getNews() {
		return news;
	}

	public void setNews(NewsInfoService news) {
		this.news = news;
	}

	public StudentInfoService getStudntLogin() {
		return studntLogin;
	}

	public void setStudntLogin(StudentInfoService studntLogin) {
		this.studntLogin = studntLogin;
	}

	public LoginInfoService getLogin() {
		return login;
	}

	public void setLogin(LoginInfoService login) {
		this.login = login;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {

		// 获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		String loginTime = sdf.format(date);

		// 得到会话session
		Map<String, Object> session = ActionContext.getContext().getSession();
		System.out.println(loginInfo.getSid()+"-------------s");
		boolean flag = login.checkLogin(loginInfo.getSid(),loginInfo.getPassword());
		List list = news.find();
		String id = loginInfo.getSid();

		// 获得请求
		Map request = (Map) ActionContext.getContext().get("request");

		if (flag) {
			session.put("sid", id);
			session.put("time", loginTime);
			request.put("news", list);
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	// 销毁session
	public String logout() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("sname");
		return SUCCESS;
	}

	// 跳转到主页
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String goToSuccess() throws Exception {
		// 获得请求
		Map request = (Map) ActionContext.getContext().get("request");
		List list = news.find();
		request.put("news", list);
		return SUCCESS;
	}
	
	// 参看所有新闻信息
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String showAllNews() throws Exception {
		// 获得请求
		Map request = (Map) ActionContext.getContext().get("request");
		List list = news.find();
		request.put("news", list);
		return SUCCESS;
	}
	
	//显示新闻详细信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String showNews() throws Exception {
		System.out.println(newsInfo.getNid());
		Integer id = newsInfo.getNid();
		NewsInfo ni= news.find(id);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("newsInfo", ni);
		return SUCCESS;
	}
}
