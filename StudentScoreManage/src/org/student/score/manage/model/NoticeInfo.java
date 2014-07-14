package org.student.score.manage.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ҡ���ֻ�
 * @���� ������̳��Ϣ�����Ϣ
 * @param noticeId
 *            ������
 * @param title
 *            �������
 * @param content
 *            ��������
 * @param author
 *            ���淢����
 * @param date
 *            ��������
 * 
 */

public class NoticeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer noticeId;
	private String title;
	private String content;
	private String author;
	private Date date;

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
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
