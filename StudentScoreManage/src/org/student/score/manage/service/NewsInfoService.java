package org.student.score.manage.service;

import java.util.List;

import org.student.score.manage.model.NewsInfo;

public interface NewsInfoService {
	// 查找所有新闻信息
	@SuppressWarnings("rawtypes")
	public List find();

	// 通过新闻编号查看新闻信息
	public NewsInfo find(Integer nid);
}
