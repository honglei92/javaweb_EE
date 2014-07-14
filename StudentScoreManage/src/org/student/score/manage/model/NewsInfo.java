package org.student.score.manage.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 摇滚轮回
 * @功能 建立新闻信息表的信息
 * @param nid
 *            新闻编号
 * @param title
 *            新闻标题
 * @param content
 *            新闻内容
 * @param date
 *            新闻日期
 * @param author
 *            新闻作者
 * 
 */

public class NewsInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer nid;
	private String title;
	private String content;
	private Date date;
	private String author;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
