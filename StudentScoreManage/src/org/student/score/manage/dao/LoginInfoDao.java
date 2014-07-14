package org.student.score.manage.dao;

import org.student.score.manage.model.LoginInfo;

public interface LoginInfoDao {

	//验证用户是否合法
	public boolean checkLogin(String sid,String password);
	
	//添加登录用户
	public void save(LoginInfo loginInfo);
	
	//根据学号和密码查找用户
	public LoginInfo find(String sid,String password);
}
