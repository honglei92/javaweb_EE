package org.student.score.manage.dao;

import java.util.List;

import org.student.score.manage.model.MajorInfo;

public interface MajorInfoDao {

	//����רҵID��ѯרҵ��Ϣ
	public MajorInfo findById(Integer zid);
	
	//����רҵ��Ϣ
	public void save(MajorInfo major);
	
	//��������רҵ��Ϣ
	@SuppressWarnings("rawtypes")
	public List findAll();
}
