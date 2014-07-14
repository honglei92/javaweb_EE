package org.student.score.manage.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.LoginInfoDao;
import org.student.score.manage.model.LoginInfo;

@Transactional
public class LoginInfoDaoImpl implements LoginInfoDao {

	private SessionFactory sessionFactory = null;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean checkLogin(String sid,String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "from LoginInfo where sid=? and password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		query.setString(0, "" + sid + "");
		query.setString(1, "" + password + "");
		List list = query.list();
		if (list.size() > 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public void save(LoginInfo loginInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(loginInfo);
		tx.commit();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public LoginInfo find(String sid, String password) {
		// TODO Auto-generated method stub
		String hql = "from LoginInfo where sid=? and password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, "" + sid + "");
		query.setString(1, "" + password + "");
		List list = query.list();
		if (list.size() > 0) {
			return (LoginInfo) list.get(0);
		} else {
			return null;
		}
	}
}
