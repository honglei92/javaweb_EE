package org.student.score.manage.action;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.student.score.manage.model.StudentInfo;
import org.student.score.manage.service.MajorInfoService;
import org.student.score.manage.service.StudentInfoService;
import org.student.score.manage.tool.Paper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowStudentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unused" })
	private List list;
	private int pageNow = 1;
	private int pageSize = 7;
	private MajorInfoService majorService;
	private StudentInfo student;

	private StudentInfoService studentService;
	private File photo;

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public StudentInfoService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentInfoService studentService) {
		this.studentService = studentService;
	}

	public void setStudent(StudentInfo student) {
		this.student = student;
	}

	public StudentInfo getStudent() {
		return student;
	}

	public MajorInfoService getMajorService() {
		return majorService;
	}

	public void setMajorService(MajorInfoService majorService) {
		this.majorService = majorService;
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		// ����רҵ�ļ���
		return majorService.findAll();
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		System.out.println(this.getPageNow());
		List list = studentService.findAll(getPageNow(), getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		Paper page = new Paper(getPageNow(), studentService.findStudentSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}

	// ¼��ѧ����Ϣ
	public String registerStduent() throws Exception {
		if (student.getSid() == null || "".equals(student.getSid())) {
			System.out.println("�Բ���ѧ�����Ϊ��");
			return ERROR;
		}
		StudentInfo si = new StudentInfo();
		String id = si.getSid();
		if (studentService.find(id) != null) {
			System.out.println("�Բ��𣬸�ѧ���Ѵ���");
			return ERROR;
		}
		si.setSid(student.getSid());
		si.setSname(student.getSname());
		si.setSex(student.getSex());
		si.setBirthday(student.getBirthday());
		si.setAllCredit(student.getAllCredit());
		si.setRemark(student.getRemark());
		si.setMajorInfo(majorService.findById(student.getMajorInfo().getZid()));
		if (this.getPhoto() != null) {
			FileInputStream fis = new FileInputStream(this.getPhoto());
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			si.setPhoto(buffer);
		}
		studentService.save(si);
		return SUCCESS;
	}

	// ����ѧ��ɾ��ѧ����Ϣ
	public String deleteStudent() {
		String id = student.getSid();
		studentService.delete(id);
		return SUCCESS;
	}

	// ����ѧ���޸�ѧ����Ϣ
	public String updateStudent() throws Exception {
		StudentInfo si = studentService.findStudent(student.getSid());
		si.setSid(student.getSid());
		si.setSname(student.getSname());
		si.setSex(student.getSex());
		si.setBirthday(student.getBirthday());
		si.setAllCredit(student.getAllCredit());
		si.setRemark(student.getRemark());
		si.setMajorInfo(majorService.findById(student.getMajorInfo().getZid()));
		if (this.getPhoto() != null) {
			FileInputStream fis = new FileInputStream(this.getPhoto());
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			si.setPhoto(buffer);
		}
		studentService.update(si);
		return SUCCESS;
	}

	// ��ʾѧ������ϸ��Ϣ
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String showDetail() {
		String sid = student.getSid();
		StudentInfo student = studentService.findStudent(sid);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("student", student);
		return SUCCESS;
	}

	// �õ���Ƭ
	public String getImage() throws Exception {
		// ��ȡ��Ӧ
		HttpServletResponse response = ServletActionContext.getResponse();
		String id = student.getSid();
		StudentInfo stu = studentService.findStudent(id);
		byte[] img = stu.getPhoto();
		response.setContentType("image/jpeg");
		ServletOutputStream os = response.getOutputStream();
		if (img != null && img.length != 0) {
			for (int i = 0; i < img.length; i++) {
				os.write(img[i]);
			}
			os.flush();
		}
		return SUCCESS;
	}

	public String addView() throws Exception {
		return SUCCESS;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String updateView() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		StudentInfo stu = studentService.findStudent(student.getSid());
		List major = majorService.findAll();
		request.put("stu", stu);
		request.put("major", major);
		return SUCCESS;
	}

}
