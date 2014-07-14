package org.student.score.manage.service;

import java.util.List;

import org.student.score.manage.model.ScoreInfo;

public interface ScoreInfoService {
	// ͨ���γ̺ź�ѧ�Ų�ѯ�ɼ�
	public ScoreInfo find(String sid, String cid);

	// ͨ���γ̺Ų�ѯĳ�ſγ̵ĳɼ�
	@SuppressWarnings("rawtypes")
	public List findByCid(String cid);

	// ͨ��ѧ�Ų�ѯĳѧ���ɼ�
	@SuppressWarnings("rawtypes")
	public List findBySid(String sid);

	// ����ɼ�
	public void save(ScoreInfo scoreInfo);

	// ����ѧ�źͿγ̺�ɾ���ɼ�
	public void delete(String sid, String cid);

	// ɾ��ĳѧ���ĳɼ�
	public void deleteOneScore(String sid);

	// ɾ��ĳ�γ̵ĳɼ�
	public void deleteOneCourse(String cid);

	// ��ҳ��ʾ�ɼ�
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow, int pageSize);

	// �ܹ��ж�������¼
	public int findScoreSize();
}
