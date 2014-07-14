package org.student.score.manage.serviceimpl;

import java.util.List;

import org.student.score.manage.dao.MajorInfoDao;
import org.student.score.manage.model.MajorInfo;
import org.student.score.manage.service.MajorInfoService;

public class MajorInfoServiceImpl implements MajorInfoService {

	//对MajorInfoDao进行依赖注入
	private MajorInfoDao majorDao;
	
	public void setMajorDao(MajorInfoDao majorDao) {
		this.majorDao = majorDao;
	}

	@Override
	public MajorInfo findById(Integer zid) {
		// TODO Auto-generated method stub
		return majorDao.findById(zid);
	}

	@Override
	public void save(MajorInfo major) {
		// TODO Auto-generated method stub
		majorDao.save(major);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return majorDao.findAll();
	}

}
