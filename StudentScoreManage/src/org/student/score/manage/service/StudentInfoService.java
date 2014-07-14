package org.student.score.manage.service;

import java.util.List;
import org.student.score.manage.model.StudentInfo;

public interface StudentInfoService {
	// 根据学号查找学生的姓名
	public String find(String sid);

	// 根据学号查找该学生
	public StudentInfo findStudent(String id);

	// 修改对象
	public void update(StudentInfo studentInfo);

	// 删除对象
	public void delete(String sid);

	// 添加对象
	public void save(StudentInfo studentInfo);

	// 分页显示学生信息
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow, int pageSize);

	// 查询一共有多少条学生记录
	public int findStudentSize();
}
