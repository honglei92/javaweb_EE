package org.student.score.manage.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.MajorInfoDao;
import org.student.score.manage.model.MajorInfo;

@Transactional
public class MajorInfoDaoImpl implements MajorInfoDao {

	private SessionFactory sessionFactory = null;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MajorInfo findById(Integer zid) {
		// TODO Auto-generated method stub
		String hql = "from MajorInfo where zid=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", "" + zid + "");
		List list = query.list();
		if (list.size() > 0) {
			return (MajorInfo) list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void save(MajorInfo major) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(major);
		tx.commit();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		String hql = "from MajorInfo";
		List list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

}
