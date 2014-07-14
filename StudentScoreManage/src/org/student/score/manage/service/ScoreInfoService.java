package org.student.score.manage.service;

import java.util.List;

import org.student.score.manage.model.ScoreInfo;

public interface ScoreInfoService {
	// 通过课程号和学号查询成绩
	public ScoreInfo find(String sid, String cid);

	// 通过课程号查询某门课程的成绩
	@SuppressWarnings("rawtypes")
	public List findByCid(String cid);

	// 通过学号查询某学生成绩
	@SuppressWarnings("rawtypes")
	public List findBySid(String sid);

	// 插入成绩
	public void save(ScoreInfo scoreInfo);

	// 根据学号和课程号删除成绩
	public void delete(String sid, String cid);

	// 删除某学生的成绩
	public void deleteOneScore(String sid);

	// 删除某课程的成绩
	public void deleteOneCourse(String cid);

	// 分页显示成绩
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow, int pageSize);

	// 总共有多少条记录
	public int findScoreSize();
}
