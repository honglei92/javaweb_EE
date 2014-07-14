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
		majorInfo.setZname("����ý��");
		majorInfo.setCount(80);
		majorInfo.setCounselor("�ƼҾ�");

		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setSid("20101001");
		studentInfo.setSname("���»�");
		studentInfo.setSex("��");
		studentInfo.setBirthday("1983-10-23");
		studentInfo.setAllCredit(0);
		studentInfo.setMajorInfo(majorInfo);
		studentInfo.setRemark("����ѧ��");
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
		course.setCname("Java EEʹ�ý̳�");
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
		news.setTitle("С���ֻ����˳�mi3");
		news.setContent("С���ֻ����˳�mi3�ֻ�");
		news.setAuthor("С�׹ٷ�");
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
		bbs.setTitle("����Spring");
		bbs.setContent("����һ�����ѧϰSpring��");
		bbs.setAuthor("��}Ӱ");
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
		notice.setTitle("����2013����ٷż�����");
		notice.setContent("2013����ٽ���6��30�տ�ʼ�ż٣�9��1�տ�ʼ�ϿΣ�");
		notice.setAuthor("ѧ����");
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
