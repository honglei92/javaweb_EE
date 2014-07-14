package com.studentscoremanage.test;

import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.student.score.manage.model.BBSMessageInfo;
import org.student.score.manage.model.CourseInfo;
import org.student.score.manage.model.ForeignInfo;
import org.student.score.manage.model.LoginInfo;
import org.student.score.manage.model.MajorInfo;
import org.student.score.manage.model.NewsInfo;
import org.student.score.manage.model.NoticeInfo;
import org.student.score.manage.model.ScoreId;
import org.student.score.manage.model.ScoreInfo;
import org.student.score.manage.model.StudentInfo;

public class StudentInfoTest {

	@Test
	public void studentMajorInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		MajorInfo majorInfo = new MajorInfo();
		majorInfo.setZname("数字媒体");
		majorInfo.setCount(80);
		majorInfo.setCounselor("黄家驹");

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setSid("20101001");
		studentInfo.setSname("刘德华");
		studentInfo.setSex("男");
		studentInfo.setBirthday("1983-10-23");
		studentInfo.setAllCredit(0);
		studentInfo.setMajorInfo(majorInfo);
		studentInfo.setRemark("三好学生");
		studentInfo.setPhoto(null);

		session.save(majorInfo);
		session.save(studentInfo);
		tx.commit();
	}

	@Test
	public void courseInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		CourseInfo course = new CourseInfo();
		course.setCid("0101");
		course.setCname("Java EE使用教程");
		course.setTerm(Short.parseShort("4"));
		course.setHours(Short.parseShort("60"));
		course.setCredit(0);
		session.save(course);
		tx.commit();
	}

	@Test
	public void scoreInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		ScoreId scoreId = new ScoreId();
		scoreId.setCid("0101");
		scoreId.setSid("20101001");

		ScoreInfo score = new ScoreInfo();
		score.setScoreId(scoreId);
		score.setScore(89);
		score.setCredit(5);
		session.save(score);
		tx.commit();
	}

	@Test
	public void loginInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		LoginInfo login = new LoginInfo();
		login.setSid("20101001");
		login.setPassword("20101001");
		
		session.save(login);
		tx.commit();
	}

	@Test
	public void newsInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		NewsInfo news = new NewsInfo();
		news.setTitle("小米手机或将退出mi3");
		news.setContent("小米手机或退出mi3手机");
		news.setAuthor("小米官方");
		news.setDate(new Date());

		session.save(news);
		tx.commit();
	}

	@Test
	public void bbsInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		BBSMessageInfo bbs = new BBSMessageInfo();
		bbs.setTitle("关于Spring");
		bbs.setContent("请问一下如何学习Spring？");
		bbs.setAuthor("风﹠影");
		bbs.setDate(new Date());

		session.save(bbs);
		tx.commit();
	}

	@Test
	public void noticeInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		NoticeInfo notice = new NoticeInfo();
		notice.setTitle("关于2013年暑假放假事宜");
		notice.setContent("2013年暑假将于6月30日开始放假，9月1日开始上课！");
		notice.setAuthor("学工办");
		notice.setDate(new Date());

		session.save(notice);
		tx.commit();
	}

	@Test
	public void foreignInfoTest() {
		Configuration cg = new Configuration()
				.configure("org/hibernate/cfg/xml/hibernate.cfg.xml");
		SessionFactory sessionFactory = cg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		ForeignInfo info = new ForeignInfo();
		info.setTitle("the relationship of China and America");
		info.setContent("America is a developed country,but China is a developing country!");
		info.setDate(new Date());

		session.save(info);
		tx.commit();
	}
}
