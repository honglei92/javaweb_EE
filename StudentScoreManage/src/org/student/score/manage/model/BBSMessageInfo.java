package org.student.score.manage.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 摇滚轮回
 * @功能 建立论坛信息表的信息
 * @param bid
 *            论坛消息编号
 * @param title
 *            论坛消息标题
 * @param content
 *            论坛信息内容
 * @param author
 *            论坛消息发帖人
 * @param date
 *            论坛消息发送日期
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
