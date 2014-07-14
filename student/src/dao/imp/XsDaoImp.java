package dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.dao.XsDao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.model.Xsb;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class XsDaoImp extends HibernateDaoSupport implements XsDao{

	@Override
	public void save(Xsb xs) {
		getHibernateTemplate().save(xs);
		
	}

	@Override
	public void delete(String xh) {
		if(find(xh) != null)
		{
			getHibernateTemplate().delete(find(xh));
		}
		
		
	}

	@Override
	public void update(Xsb xs) {
		getHibernateTemplate().update(xs);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Xsb find(String xh) {
		List list=getHibernateTemplate().find("from Xsb where xh=?", xh);
		if(list.size()>0)
			return (Xsb) list.get(0);
		else
			return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(final int pageNow,final int pageSize) {
		List list=(List) getHibernateTemplate().execute(
				new HibernateCallback() {
					int size=pageNow*pageSize-pageSize;
					@Override
					public Object doInHibernate(Session session) throws HibernateException,
							SQLException {
						Query query=session.createQuery("from Xsb order by xh");
						query.setFirstResult(size);
						query.setMaxResults(pageSize);
						List l=query.list();
						return l;
					}
				});
		return list;
	}

	@Override
	public int findXsSize() {
		return getHibernateTemplate().find("from Xsb").size();
	}
	
}
