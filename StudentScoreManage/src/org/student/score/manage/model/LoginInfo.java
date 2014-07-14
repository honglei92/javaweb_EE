package org.student.score.manage.model;

import java.io.*;

/**
 * @author 摇滚轮回
 * @功能 建立登录信息表的信息
 * @id 标识
 * @sid 学号
 * @password 密码
 * 
 */

public class LoginInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String sid;
	private String password;

	// 建立不含参数的构造方法
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
