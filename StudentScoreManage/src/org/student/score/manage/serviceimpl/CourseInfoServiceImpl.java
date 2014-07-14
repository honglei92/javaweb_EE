package org.student.score.manage.serviceimpl;

import java.util.List;

import org.student.score.manage.dao.CourseInfoDao;
import org.student.score.manage.model.CourseInfo;
import org.student.score.manage.service.CourseInfoService;

public class CourseInfoServiceImpl implements CourseInfoService {

	//对CourseInfoDao进行依赖注入
	private CourseInfoDao courseDao;
	
	public void setCourseDao(CourseInfoDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public CourseInfo find(String cid) {
		// TODO Auto-generated method stub
		return courseDao.find(cid);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return courseDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findCourseSize() {
		// TODO Auto-generated method stub
		return courseDao.findCourseSize();
	}

	@Override
	public void save(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		courseDao.save(courseInfo);
	}

	@Override
	public void delete(String cid) {
		// TODO Auto-generated method stub
		courseDao.delete(cid);
	}

	@Override
	public void update(CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		courseDao.update(courseInfo);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

}
