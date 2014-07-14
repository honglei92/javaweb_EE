package org.student.score.manage.service;

import java.util.List;

import org.student.score.manage.model.MajorInfo;

public interface MajorInfoService {
	// 根据专业ID查询专业信息
	public MajorInfo findById(Integer zid);

	// 保存专业信息
	public void save(MajorInfo major);

	// 查找所用专业信息
	@SuppressWarnings("rawtypes")
	public List findAll();
}
