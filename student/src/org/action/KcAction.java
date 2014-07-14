package org.action;

import java.util.List;
import java.util.Map;

import org.model.Kcb;
import org.model.Zyb;
import org.service.KcService;
import org.service.ZyService;
import org.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class KcAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int pageNow=1;
	private int pageSize=4;
	private Kcb kc;
	private KcService kcService;
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
	public Kcb getKc() {
		return kc;
	}
	public void setKc(Kcb kc) {
		this.kc = kc;
	}
	public KcService getKcService() {
		return kcService;
	}
	public void setKcService(KcService kcService) {
		this.kcService = kcService;
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
		List list=kcService.findAll(pageNow, pageSize);
		System.out.println(pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		System.out.println(kcService.findKcSize());
		Pager page=new Pager(getPageNow(),kcService.findKcSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String findKc() throws Exception{
		String kch=kc.getKch();
		Kcb stu2=kcService.find(kch);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kc", stu2);
		return SUCCESS;
	}
	
	/*public String deleteKc() throws Exception{
		String kch=kc.getKch();
		kcService.delete(kch);
		return SUCCESS;
	}*/
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String updatekcView() throws Exception{
		String Kch=kc.getKch();
		Kcb kcInfo=kcService.find(Kch);
		List zys=zyService.getAll();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kcInfo", kcInfo);
		request.put("zys", zys);
		return SUCCESS;
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	/*public String updatekc() throws Exception{
		Kcb kc1=kcService.find(kc.getKch());
		System.out.println(kc.getKcm());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXs(kc.getXs());
		kc1.setXf(kc.getXf());
		Map request=(Map) ActionContext.getContext().get("request");
		kcService.update(kc1);
		return SUCCESS;
	}
	*/
	public String addKcView() throws Exception{
		return SUCCESS;
	}
	
	public String addKc() {
		try {
			System.out.println(kc.getKch()+"--------------");
			if(kc.getKch()==null||"".equals(kc.getKch())){
				return ERROR;
			}
			Kcb cou=new Kcb();
			String Kch1=kc.getKch();
			if(kcService.find(Kch1)!=null){
				return ERROR;
			}
			cou.setKch(kc.getKch());
			cou.setKcm(kc.getKcm());
			cou.setKxxq(kc.getKxxq());
			cou.setXs(kc.getXs());
			cou.setXf(kc.getXf());
			kcService.save(cou);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
