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
 * @author ҡ���ֻ�
 * @param <LoginService>
 * @param sid
 *            ѧ��
 * @param password
 *            ����
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

		// ��ȡ��ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		String loginTime = sdf.format(date);

		// �õ��Ựsession
		Map<String, Object> session = ActionContext.getContext().getSession();
		System.out.println(loginInfo.getSid()+"-------------s");
		boolean flag = login.checkLogin(loginInfo.getSid(),loginInfo.getPassword());
		List list = news.find();
		String id = loginInfo.getSid();

		// �������
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

	// ����session
	public String logout() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("sname");
		return SUCCESS;
	}

	// ��ת����ҳ
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String goToSuccess() throws Exception {
		// �������
		Map request = (Map) ActionContext.getContext().get("request");
		List list = news.find();
		request.put("news", list);
		return SUCCESS;
	}
	
	// �ο�����������Ϣ
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String showAllNews() throws Exception {
		// �������
		Map request = (Map) ActionContext.getContext().get("request");
		List list = news.find();
		request.put("news", list);
		return SUCCESS;
	}
	
	//��ʾ������ϸ��Ϣ
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
