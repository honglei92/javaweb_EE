package org.student.score.manage.service;

import java.util.List;

import org.student.score.manage.model.NewsInfo;

public interface NewsInfoService {
	// ��������������Ϣ
	@SuppressWarnings("rawtypes")
	public List find();

	// ͨ�����ű�Ų鿴������Ϣ
	public NewsInfo find(Integer nid);
}
