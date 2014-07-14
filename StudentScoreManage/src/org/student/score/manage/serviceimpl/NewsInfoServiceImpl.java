package org.student.score.manage.serviceimpl;

import java.util.List;

import org.student.score.manage.dao.NewsInfoDao;
import org.student.score.manage.model.NewsInfo;
import org.student.score.manage.service.NewsInfoService;

public class NewsInfoServiceImpl implements NewsInfoService {

	//对NewsInfoDao进行依赖注入
	private NewsInfoDao newsDao;
	
	public void setNewsDao(NewsInfoDao newsDao) {
		this.newsDao = newsDao;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List find() {
		// TODO Auto-generated method stub
		return newsDao.find();
	}

	@Override
	public NewsInfo find(Integer nid) {
		// TODO Auto-generated method stub
		return newsDao.find(nid);
	}

}
