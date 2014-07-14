package org.student.score.manage.model;

import java.io.*;

/**
 * @author 摇滚轮回
 * @功能 建立成绩信息表的信息
 * @scoreId 成绩Id
 * @score 成绩
 * @credit 学分
 * 
 */

public class ScoreInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private ScoreId scoreId;
	private Integer score;
	private Integer credit;

	// 建立不含有参数的构造方法
	public ScoreInfo() {

	}

	public ScoreInfo(Integer score, Integer credit) {
		this.score = score;
		this.credit = credit;
	}

	public ScoreInfo(ScoreId scoreId, Integer score, Integer credit) {
		this.scoreId = scoreId;
		this.score = score;
		this.credit = credit;
	}

	public ScoreId getScoreId() {
		return scoreId;
	}

	public void setScoreId(ScoreId scoreId) {
		this.scoreId = scoreId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

}
