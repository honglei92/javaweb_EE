package dao.imp;

import java.util.List;

import org.dao.CjDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Cjb;
import org.model.CjbId;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CjDaoImp extends HibernateDaoSupport implements CjDao{

	@Override
	public void saveorupdateCj(Cjb cj) {
		getHibernateTemplate().saveOrUpdate(cj);
		
	}

	@Override
	public void deleteCj(String xh, String kch) {
		if(getXsCj(xh, kch) != null)
		getHibernateTemplate().delete(getXsCj(xh, kch));
		
	}

	@Override
	public Cjb getXsCj(String xh, String kch) {
		CjbId cjbId=new CjbId();
		cjbId.setXh(xh);
		cjbId.setKch(kch);
		return (Cjb) getHibernateTemplate().get(Cjb.class, cjbId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("SELECT c.id.xh,a.xm,b.kcm,c.cj,c.xf,c.id.kch FROM " +
				"Xsb a,Kcb b,Cjb c WHERE a.xh=c.id.xh AND b.kch=c.id.kch");
		query.setFirstResult((pageNow-1)*pageSize);
		query.setMaxResults(pageSize);
		List list=query.list();
		ts.commit();
		session.close();
		return list;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getXsCjList(String xh) {
	    return getHibernateTemplate().find("SELECT c.id.xh,a.xm,b.kcm,c.cj,c.xf FROM Xsb a,Kcb b,Cjb c WHERE c.id.xh=? AND a.xh=c.id.xh AND b.kch=c.id.kch", xh);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getKcCjList(String kch) {
		return getHibernateTemplate().find("from Cjb where kch=?",kch);
	}

	@Override
	public void deleteOneXsCj(String xh) {
		getHibernateTemplate().deleteAll(getXsCjList(xh));
		
	}

	@Override
	public void deleteOneKcInfo(String kch) {
		getHibernateTemplate().deleteAll(this.getKcCjList(kch));
		
	}

	@Override
	public int findCjSize() {
		return getHibernateTemplate().find("from Cjb").size();
	}
	
}
