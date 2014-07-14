package org.student.score.manage.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ҡ���ֻ�
 * @���� ������̳��Ϣ�����Ϣ
 * @param bid
 *            ��̳��Ϣ���
 * @param title
 *            ��̳��Ϣ����
 * @param content
 *            ��̳��Ϣ����
 * @param author
 *            ��̳��Ϣ������
 * @param date
 *            ��̳��Ϣ��������
 * 
 */

public class BBSMessageInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer bid;
	private String title;
	private String content;
	private String author;
	private Date date;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
