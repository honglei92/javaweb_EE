package org.student.score.manage.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.ScoreInfoDao;
import org.student.score.manage.model.ScoreId;
import org.student.score.manage.model.ScoreInfo;

@Transactional
public class ScoreInfoDaoImpl extends HibernateDaoSupport implements
		ScoreInfoDao {

	@Override
	public ScoreInfo find(String sid, String cid) {
		// TODO Auto-generated method stub
		ScoreId si = new ScoreId();
		si.setCid(cid);
		si.setSid(sid);
		return getHibernateTemplate().get(ScoreInfo.class, si);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findByCid(String cid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from ScoreInfo where cid=?", cid);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findBySid(String sid) {
		// TODO Auto-generated method stub
		String hql = "select ci.cname,sc.score,sc.credit from ScoreInfo as sc,CourseInfo as ci,StudentInfo as st where sc.scoreId.sid=? and st.sid=sc.scoreId.sid and ci.cid=sc.scoreId.cid";
		return getHibernateTemplate().find(hql, sid);
	}

	@Override
	public void save(ScoreInfo scoreInfo) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(scoreInfo);
	}

	@Override
	public void delete(String sid, String cid) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(find(sid, cid));
	}

	@Override
	public void deleteOneScore(String sid) {
		// TODO Auto-generated method stub
		getHibernateTemplate().deleteAll(this.findBySid(sid));
	}

	@Override
	public void deleteOneCourse(String cid) {
		// TODO Auto-generated method stub
		getHibernateTemplate().deleteAll(this.findByCid(cid));
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		Transaction tx = session.beginTransaction();
		int start = (pageNow - 1) * pageSize;
		String hql = "select si.scoreId.sid,st.sname,ci.cname,si.score,si.credit,si.scoreId.cid "
				+ "from ScoreInfo as si,CourseInfo as ci,StudentInfo as st where st.sid=si.scoreId.sid and si.scoreId.cid=ci.cid";
		Query query = session.createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(pageSize);
		List list = query.list();
		tx.commit();
		return list;
	}

	@Override
	public int findScoreSize() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from ScoreInfo").size();
	}

}
