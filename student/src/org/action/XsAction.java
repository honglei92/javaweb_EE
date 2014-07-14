package org.action;

import java.util.List;
import java.util.Map;

import org.model.Xsb;
import org.model.Zyb;
import org.service.XsService;
import org.service.ZyService;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class XsAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int pageNow=1;
	private int pageSize=4;
	private Xsb xs;
	private XsService xsService;
	private Zyb zy;
	private ZyService zyService;
	@SuppressWarnings({ "rawtypes", "unused" })
	private List list;
	
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
	public Xsb getXs() {
		return xs;
	}
	public void setXs(Xsb xs) {
		this.xs = xs;
	}
	public XsService getXsService() {
		return xsService;
	}
	public void setXsService(XsService xsService) {
		this.xsService = xsService;
	}
	
	public Zyb getZy() {
		return zy;
	}
	public void setZy(Zyb zy) {
		this.zy = zy;
	}
	public ZyService getZyService() {
		return zyService;
	}
	public void setZyService(ZyService zyService) {
		this.zyService = zyService;
	}
	@SuppressWarnings("rawtypes")
	public List getList() {
		return zyService.getAll();
	}
	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception{
		System.out.println(this.getPageNow());
		List list=xsService.findAll(pageNow, pageSize);
		System.out.println(pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		System.out.println(xsService.findXsSize());
		Pager page=new Pager(getPageNow(),xsService.findXsSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String findXs() throws Exception{
		String xh=xs.getXh();
		Xsb stu2=xsService.find(xh);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("xs", stu2);
		return SUCCESS;
	}
	
	public String deleteXs() throws Exception{
		String xh=xs.getXh();
		xsService.delete(xh);
		return SUCCESS;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String updateXsView() throws Exception{
		String xh=xs.getXh();
		Xsb xsInfo=xsService.find(xh);
		List zys=zyService.getAll();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("xsInfo", xsInfo);
		request.put("zys", zys);
		return SUCCESS;
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public String updateXs() throws Exception{
		Xsb xs1=xsService.find(xs.getXh());
		System.out.println(xs.getXm());
		xs1.setXm(xs.getXm());
		xs1.setXb(xs.isXb());
		xs1.setZyb(zyService.getOneZy(xs.getZyb().getId()));
		xs1.setCssj(xs.getCssj());
		xs1.setZxf(xs.getZxf());
		xs1.setBz(xs.getBz());
		Map request=(Map) ActionContext.getContext().get("request");
		xsService.update(xs1);
		return SUCCESS;
	}
	
	public String addXsView() throws Exception{
		return SUCCESS;
	}
	
	public String addXs() throws Exception{
		if(xs.getXh()==null||"".equals(xs.getXh())){
			return ERROR;
		}
		Xsb stu=new Xsb();
		String xh1=xs.getXh();
		if(xsService.find(xh1)!=null){
			return ERROR;
		}
		stu.setXh(xs.getXh());
		stu.setXm(xs.getXm());
		stu.setXb(xs.isXb());
		stu.setCssj(xs.getCssj());
		System.out.println(xs.getCssj());
		stu.setZxf(xs.getZxf());
		stu.setBz(xs.getBz());
		stu.setZyb(zyService.getOneZy(xs.getZyb().getId()));
		xsService.save(stu);
		return SUCCESS;
	}
}
