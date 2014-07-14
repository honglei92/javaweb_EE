package org.student.score.manage.model;

import java.io.*;

/**
 * @author ҡ���ֻ�
 * @���� �����γ���Ϣ�����Ϣ
 * @cid �γ̺�
 * @cname �γ���
 * @term ��ѧѧ��
 * @hours ѧʱ
 * @credit ѧ��
 * 
 */

public class CourseInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cid;
	private String cname;
	private Short term;
	private Short hours;
	private Integer credit;

	// �������������Ĺ��췽��
	public CourseInfo() {

	}

	// �������в����Ĺ��췽��
	public CourseInfo(String cname, Short term, Short hours, Integer credit) {
		super();
		this.cname = cname;
		this.term = term;
		this.hours = hours;
		this.credit = credit;
	}
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Short getTerm() {
		return term;
	}

	public void setTerm(Short term) {
		this.term = term;
	}

	public Short getHours() {
		return hours;
	}

	public void setHours(Short hours) {
		this.hours = hours;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

}
