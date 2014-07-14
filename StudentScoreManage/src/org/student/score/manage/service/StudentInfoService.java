package org.student.score.manage.service;

import java.util.List;
import org.student.score.manage.model.StudentInfo;

public interface StudentInfoService {
	// ����ѧ�Ų���ѧ��������
	public String find(String sid);

	// ����ѧ�Ų��Ҹ�ѧ��
	public StudentInfo findStudent(String id);

	// �޸Ķ���
	public void update(StudentInfo studentInfo);

	// ɾ������
	public void delete(String sid);

	// ��Ӷ���
	public void save(StudentInfo studentInfo);

	// ��ҳ��ʾѧ����Ϣ
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow, int pageSize);

	// ��ѯһ���ж�����ѧ����¼
	public int findStudentSize();
}
