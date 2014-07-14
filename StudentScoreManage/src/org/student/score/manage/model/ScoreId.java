package org.student.score.manage.model;

import java.io.*;

/**
 * @author 摇滚轮回
 * @建立成绩表的联合主键表
 * @sid 学号
 * @cid 课程号
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
