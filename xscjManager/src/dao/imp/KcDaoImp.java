package dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.dao.KcDao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.model.Kcb;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class KcDaoImp extends HibernateDaoSupport implements KcDao{

	@Override
	public Kcb find(String kch) {
		List list=getHibernateTemplate().find("from Kcb where kch=?", kch);
		if(list.size()>0)
			return (Kcb)list.get(0);
		else
			return null;
	}

	@Override
	public List findAll(final int pageNow, final int pageSize) {
		List list=(List) getHibernateTemplate().execute(
				new HibernateCallback() {
					int size=pageNow*pageSize-pageSize;
					@Override
					public Object doInHibernate(Session session) throws HibernateException,
							SQLException {
						Query query=session.createQuery("from Kcb order by kch");
						query.setFirstResult(size);
						query.setMaxResults(pageSize);
						List l=query.list();
						return l;
					}
				});
				return list;
	}

	@Override
	public int findKcSize() {
		return getHibernateTemplate().find("from Kcb").size();
	}
	
}
