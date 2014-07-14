package org.student.score.manage.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.CourseInfoDao;
import org.student.score.manage.model.CourseInfo;

@Transactional
public class CourseInfoDaoImpl implements CourseInfoDao {

	private SessionFactory sessionFactory = null;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public CourseInfo find(String cid) {
		// TODO Auto-generated method stub
		String hql = "from CourseInfo where cid=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, "" + cid + "");
		List list = query.list();
		if (list.size() > 0) {
			return (CourseInfo) list.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		int start = pageNow * pageSize - pageSize;
		String hql = "from CourseInfo order by cid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(pageSize);
		List list = query.list();
		return list;
	}

	@Override
	public int findCourseSize() {
		// TODO Auto-generated method stub
		int count = 0;
		String hql = "select count(*) from CourseInfo";
		count = Integer.parseInt(sessionFactory.getCurrentSession()
				.createQuery(hql).uniqueResult().toString());
		return count;
	}

	@Override
	public void save(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(courseInfo);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(String cid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		CourseInfo course = (CourseInfo) session.get(CourseInfo.class, cid);
		session.delete(course);
		tx.commit();
		session.close();
	}

	@Override
	public void update(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(courseInfo);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		String hql = "from CourseInfo";
		List list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

}
