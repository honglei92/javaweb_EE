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

	// ��ת����ʾ�γ���Ϣ�Ľ���
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

	// ��ת����ӿγ���Ϣ�Ľ���
	public String addCourseView() throws Exception {
		return SUCCESS;
	}

	// ��ת���޸�ѧ����Ϣ�Ľ���
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String updateCourseView() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		CourseInfo courseInfo = courseService.find(course.getCid());
		List list = courseService.findAll();
		request.put("list", list);
		request.put("course", courseInfo);
		return SUCCESS;
	}
	
	//��ʾ�γ���ϸ��Ϣ
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String showDetail() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		CourseInfo courseInfo = courseService.find(course.getCid());
		request.put("course", courseInfo);
		return SUCCESS;
	}

	// ��ӿγ�
	public String addCourse() throws Exception {
		// �ж�����Ŀγ̺��Ƿ�Ϊ��
		if (course.getCid() == null || "".equals(course.getCid())) {
			System.out.println("�γ̺�Ϊ��");
			return ERROR;
		}

		// �жϿγ��Ƿ����
		String cid = course.getCid();
		if (courseService.find(cid) != null) {
			System.out.println("�ÿγ��Ѿ�����");
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

	// �޸Ŀγ���Ϣ
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

	// ɾ���γ���Ϣ
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
