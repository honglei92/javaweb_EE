package org.student.score.manage.action;

import java.util.List;
import java.util.Map;

import org.student.score.manage.model.CourseInfo;
import org.student.score.manage.service.CourseInfoService;
import org.student.score.manage.tool.Paper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CourseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int pageNow = 1;
	private int pageSize = 7;
	private CourseInfo course;
	private CourseInfoService courseService;
	private Paper page;
	@SuppressWarnings({ "rawtypes", "unused" })
	private List list;

	@SuppressWarnings("rawtypes")
	public List getList() {
		return courseService.findAll();
	}

	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}

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

	public Paper getPage() {
		return page;
	}

	public void setPage(Paper page) {
		this.page = page;
	}

	public CourseInfo getCourse() {
		return course;
	}

	public void setCourse(CourseInfo course) {
		this.course = course;
	}

	public CourseInfoService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseInfoService courseService) {
		this.courseService = courseService;
	}

	// 跳转到显示课程信息的界面
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String showCourseView() throws Exception {
		List list = courseService.findAll(getPageNow(), getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		Paper page = new Paper(this.getPageNow(),
				courseService.findCourseSize());
		request.put("page", page);
		request.put("list", list);
		return SUCCESS;
	}

	// 跳转到添加课程信息的界面
	public String addCourseView() throws Exception {
		return SUCCESS;
	}

	// 跳转到修改学生信息的界面
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String updateCourseView() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		CourseInfo courseInfo = courseService.find(course.getCid());
		List list = courseService.findAll();
		request.put("list", list);
		request.put("course", courseInfo);
		return SUCCESS;
	}
	
	//显示课程详细信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String showDetail() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		CourseInfo courseInfo = courseService.find(course.getCid());
		request.put("course", courseInfo);
		return SUCCESS;
	}

	// 添加课程
	public String addCourse() throws Exception {
		// 判断输入的课程号是否为空
		if (course.getCid() == null || "".equals(course.getCid())) {
			System.out.println("课程号为空");
			return ERROR;
		}

		// 判断课程是否存在
		String cid = course.getCid();
		if (courseService.find(cid) != null) {
			System.out.println("该课程已经存在");
			return SUCCESS;
		}
		CourseInfo courseInfo = new CourseInfo();
		courseInfo.setCid(course.getCid());
		courseInfo.setCname(course.getCname());
		courseInfo.setCredit(course.getCredit());
		courseInfo.setHours(course.getHours());
		courseInfo.setTerm(course.getTerm());
		courseService.save(courseInfo);
		return SUCCESS;
	}

	// 修改课程信息
	public String updateCourse() throws Exception {
		CourseInfo courseInfo = courseService.find(course.getCid());
		courseInfo.setCid(course.getCid());
		courseInfo.setCname(course.getCname());
		courseInfo.setCredit(course.getCredit());
		courseInfo.setHours(course.getHours());
		courseInfo.setTerm(course.getTerm());
		courseService.update(courseInfo);
		return SUCCESS;
	}

	// 删除课程信息
	public String deleteCourse() throws Exception {
		String cid = course.getCid();
		courseService.delete(cid);
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

}
