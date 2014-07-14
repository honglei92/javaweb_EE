package org.student.score.manage.daoimpl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import org.student.score.manage.dao.NewsInfoDao;
import org.student.score.manage.model.NewsInfo;

@Transactional
public class NewInfoDaoImpl extends HibernateDaoSupport implements NewsInfoDao {

	@SuppressWarnings("rawtypes")
	@Override
	public List find() {
		// TODO Auto-generated method stub
		String hql = "from NewsInfo order by date DESC";
		return getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public NewsInfo find(Integer nid) {
		// TODO Auto-generated method stub
		NewsInfo newsInfo = null;
		String hql = "from NewsInfo where nid=?";
		List list = getHibernateTemplate().find(hql, nid);
		if(list.size() > 0) {
			newsInfo = (NewsInfo) list.get(0);
			return newsInfo;
		}else {
			return null;
		}
	}
}
