package org.student.score.manage.model;

import java.io.*;

/**
 * @author ҡ���ֻ�
 * @���� ������¼��Ϣ�����Ϣ
 * @id ��ʶ
 * @sid ѧ��
 * @password ����
 * 
 */

public class LoginInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String sid;
	private String password;

	// �������������Ĺ��췽��
	public LoginInfo() {
		super();
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
