package org.student.score.manage.dao;

import java.util.List;

import org.student.score.manage.model.NewsInfo;


public interface NewsInfoDao {

	// ��������������Ϣ
	@SuppressWarnings("rawtypes")
	public List find();
	
	//ͨ�����ű�Ų鿴������Ϣ
	public NewsInfo find(Integer nid);
}
