package org.student.score.manage.serviceimpl;

import java.util.List;
import org.student.score.manage.dao.StudentInfoDao;
import org.student.score.manage.model.StudentInfo;
import org.student.score.manage.service.StudentInfoService;

public class StudentInfoServiceImpl implements StudentInfoService {

	//对StudentInfoDao进行依赖注入
	private StudentInfoDao studentDao;
	
	public void setStudentDao(StudentInfoDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public String find(String sid) {
		// TODO Auto-generated method stub
		return studentDao.find(sid);
	}

	@Override
	public StudentInfo findStudent(String id) {
		// TODO Auto-generated method stub
		return studentDao.findStudent(id);
	}

	@Override
	public void update(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		studentDao.update(studentInfo);
	}

	@Override
	public void delete(String sid) {
		// TODO Auto-generated method stub
		studentDao.delete(sid);
	}

	@Override
	public void save(StudentInfo studentInfo) {
		// TODO Auto-generated method stub
		studentDao.save(studentInfo);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return studentDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findStudentSize() {
		// TODO Auto-generated method stub
		return studentDao.findStudentSize();
	}
}
