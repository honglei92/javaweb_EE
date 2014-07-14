package org.student.score.manage.model;

import java.io.*;

/**
 * @author ҡ���ֻ�
 * @�����ɼ��������������
 * @sid ѧ��
 * @cid �γ̺�
 * 
 */

public class ScoreId implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sid;
	private String cid;

	public ScoreId() {

	}

	public ScoreId(String sid, String cid) {
		this.sid = sid;
		this.cid = cid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
}
