package org.student.score.manage.dao;

import java.util.List;

import org.student.score.manage.model.CourseInfo;

public interface CourseInfoDao {

	//���ݿγ̺Ų��ҿγ�
	public CourseInfo find(String cid);
	
	//��ҳ��ʾ�γ���Ϣ
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow,int pageSize);
	
	// �ܹ��ж�������¼
	public int findCourseSize();
	
	//�������пγ���Ϣ
	@SuppressWarnings("rawtypes")
	public List findAll();
	
	//��ӿγ���Ϣ
	public void save(CourseInfo courseInfo);
	
	//ɾ���γ���Ϣ
	public void delete(String cid);
	
	//�޸Ŀγ���Ϣ
	public void update(CourseInfo courseInfo);
}
