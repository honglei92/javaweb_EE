package org.student.score.manage.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ҡ���ֻ�
 * @���� ������̳��Ϣ�����Ϣ
 * @param foreignId
 *            ������Ϣ���
 * @param title
 *            ������Ϣ����
 * @param content
 *            ������Ϣ����
 * @param date
 *            ������Ϣ����
 * 
 */

public class ForeignInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer foreignId;
	private String title;
	private String content;
	private Date date;

	public Integer getForeignId() {
		return foreignId;
	}

	public void setForeignId(Integer foreignId) {
		this.foreignId = foreignId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
