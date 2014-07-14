package org.student.score.manage.dao;

import java.util.List;

import org.student.score.manage.model.CourseInfo;

public interface CourseInfoDao {

	//根据课程号查找课程
	public CourseInfo find(String cid);
	
	//分页显示课程信息
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow,int pageSize);
	
	// 总共有多少条记录
	public int findCourseSize();
	
	//查找所有课程信息
	@SuppressWarnings("rawtypes")
	public List findAll();
	
	//添加课程信息
	public void save(CourseInfo courseInfo);
	
	//删除课程信息
	public void delete(String cid);
	
	//修改课程信息
	public void update(CourseInfo courseInfo);
}
