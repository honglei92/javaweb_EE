package org.dao;

import org.model.Dlb;

public interface DlDao {
	//�����û�
	public void save(Dlb user);
	//���ѧ�źͿ������
	public Dlb find(String xh,String kl,String role);
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean exitXh(String xh);
}
