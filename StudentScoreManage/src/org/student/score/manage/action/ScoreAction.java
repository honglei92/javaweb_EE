package org.student.score.manage.action;

import java.util.List;
import java.util.Map;
import org.student.score.manage.model.CourseInfo;
import org.student.score.manage.model.ScoreId;
import org.student.score.manage.model.ScoreInfo;
import org.student.score.manage.service.CourseInfoService;
import org.student.score.manage.service.ScoreInfoService;
import org.student.score.manage.service.StudentInfoService;
import org.student.score.manage.tool.Paper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ScoreAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int pageNow = 1;
	private int pageSize = 7;
	private StudentInfoService studentService;
	private CourseInfoService courseService;
	private ScoreInfoService scoreService;
	private ScoreInfo score;

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public ScoreInfoService getScoreService() {
		return scoreService;
	}

	public void setScoreService(ScoreInfoService scoreService) {
		this.scoreService = scoreService;
	}

	public ScoreInfo getScore() {
		return score;
	}

	public void setScore(ScoreInfo score) {
		this.score = score;
	}

	public StudentInfoService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentInfoService studentService) {
		this.studentService = studentService;
	}

	public CourseInfoService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseInfoService courseService) {
		this.courseService = courseService;
	}

	// 跳转到成绩信息页面
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String showScoreView() throws Exception {
		Map map = (Map) ActionContext.getContext().get("request");
		List list = scoreService.findAll(getPageNow(), getPageSize());
		Paper page = new Paper(getPageNow(), scoreService.findScoreSize());
		map.put("page", page);
		map.put("list", list);
		return SUCCESS;
	}

	// 跳转到添加成绩的页面
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String addScoreView() throws Exception {
		List listOne = studentService.findAll(1,
				studentService.findStudentSize());
		List listTwo = courseService.findAll(1, courseService.findCourseSize());
		Map map = (Map) ActionContext.getContext().get("request");
		map.put("listOne", listOne);
		map.put("listTwo", listTwo);
		return SUCCESS;
	}

	// 添加成绩信息
	public String addScore() throws Exception {
		ScoreInfo scoreInfo = null;
		ScoreId si = new ScoreId();
		si.setSid(score.getScoreId().getSid());
		si.setCid(score.getScoreId().getCid());
		if (scoreService.find(score.getScoreId().getSid(), score.getScoreId()
				.getCid()) == null) {
			scoreInfo = new ScoreInfo();
			scoreInfo.setScoreId(si);
		} else {
			scoreInfo = scoreService.find(score.getScoreId().getSid(), score
					.getScoreId().getCid());
		}
		CourseInfo course = courseService.find(score.getScoreId().getCid());
		scoreInfo.setScore(score.getScore());
		if (scoreInfo.getScore() > 60 || scoreInfo.getScore() == 60) {
			scoreInfo.setCredit(course.getCredit());
		} else {
			scoreInfo.setCredit(0);
		}
		scoreService.save(scoreInfo);
		return SUCCESS;
	}

	// 删除学生信息
	public String deleteScore() throws Exception {
		String sid = score.getScoreId().getSid();
		String cid = score.getScoreId().getCid();
		scoreService.delete(sid, cid);
		return SUCCESS;
	}

	// 通过学号查看学生成绩
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String findScore() throws Exception {
		List list = scoreService.findBySid(score.getScoreId().getSid());
		if (list.size() > 0) {
			Map map = (Map) ActionContext.getContext().get("request");
			map.put("list", list);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
}
