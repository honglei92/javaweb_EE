package org.service;

import org.model.Dlb;

public interface DlService {
	//�����û�
	public void save(Dlb user);
	//���ѧ�źͿ������
	public Dlb find(String xh,String kl,String role);
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existXh(String xh);
}
