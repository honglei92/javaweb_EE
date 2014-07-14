package org.student.score.manage.model;

import java.io.*;

/**
 * @author Lenovo
 * @���� ����רҵ��Ϣ�����Ϣ
 * @zid רҵID
 * @zname רҵ��
 * @count ����
 * @counselor ����Ա
 * 
 */

public class MajorInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer zid;
	private String zname;
	private Integer count;
	private String counselor;

	// �������������Ĺ��췽��
	public MajorInfo() {

	}

	// �������в����Ĺ��췽��
	public MajorInfo(String zname, Integer count, String counselor) {
		this.zname = zname;
		this.count = count;
		this.counselor = counselor;
	}

	public Integer getZid() {
		return zid;
	}

	public void setZid(Integer zid) {
		this.zid = zid;
	}

	public String getZname() {
		return zname;
	}

	public void setZname(String zname) {
		this.zname = zname;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getCounselor() {
		return counselor;
	}

	public void setCounselor(String counselor) {
		this.counselor = counselor;
	}

}
