package org.student.score.manage.serviceimpl;

import org.student.score.manage.dao.LoginInfoDao;
import org.student.score.manage.model.LoginInfo;
import org.student.score.manage.service.LoginInfoService;

public class LoginInfoServiceImpl implements LoginInfoService {

	//对LoginInfoDao进行依赖注入
	private LoginInfoDao loginDao;
	
	public void setLoginDao(LoginInfoDao loginDao) {
		this.loginDao = loginDao;
	}


	@Override
	public void save(LoginInfo loginInfo) {
		// TODO Auto-generated method stub
		loginDao.save(loginInfo);
	}

	@Override
	public LoginInfo find(String sid, String password) {
		// TODO Auto-generated method stub
		return loginDao.find(sid, password);
	}


	@Override
	public boolean checkLogin(String sid,String password) {
		// TODO Auto-generated method stub
		return loginDao.checkLogin(sid, password);
	}

}
