package org.student.score.manage.daoimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.StudentInfoDao;
import org.student.score.manage.model.StudentInfo;

@Transactional
public class StudentInfoDaoImpl implements StudentInfoDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String find(String sid) {
		// TODO Auto-generated method stub
		String student = null;
		String sql = "select sname from StudentInfo where sid=?";
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		query.setString(0, "" + sid + "");
		List<?> list = query.list();
		if (list.size() > 0) {
			student = (String) list.get(0);
			return student;
		} else {
			return null;
		}
	}

	@Override
	public void update(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(studentInfo);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(String sid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		StudentInfo si = (StudentInfo) session.get(StudentInfo.class, sid);
		session.delete(si);
		tx.commit();
		session.close();
	}

	@Override
	public void save(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(studentInfo);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		int start = (pageNow - 1) * pageSize;
		String hql = "from StudentInfo order by sid ASC";
		Query query = sessionFactory.openSession().createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(pageSize);
		List list = query.list();
		return list;
	}

	@Override
	public int findStudentSize() {
		// TODO Auto-generated method stub
		int count = 0;
		String hql = "select count(*) from StudentInfo";
		Query query = sessionFactory.openSession().createQuery(hql);
		count = Integer.parseInt(query.uniqueResult().toString());
		return count;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public StudentInfo findStudent(String id) {
		// TODO Auto-generated method stub
		StudentInfo student = null;
		String hql = "from StudentInfo where id=?";
		Query query = sessionFactory.openSession().createQuery(hql);
		query.setString(0, "" + id + "");
		List list = query.list();
		if (list.size() > 0) {
			student = (StudentInfo) list.get(0);
			return student;
		} else {
			return null;
		}
	}
}
