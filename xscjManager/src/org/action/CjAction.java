package org.action;

import java.util.List;
import java.util.Map;
import org.tool.Pager;
import org.model.Cjb;
import org.model.CjbId;
import org.model.Kcb;
import org.service.CjService;
import org.service.KcService;
import org.service.XsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CjAction extends ActionSupport {
	private static final long serialVersionUID = 1694339047815382086L;
	private int pageNow=1;
	private int pageSize=4;
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

	private Cjb cj;
	private CjService cjService;

	public Cjb getCj() {
		return cj;
	}

	public void setCj(Cjb cj) {
		this.cj = cj;
	}

	public void setCjService(CjService cjService) {
		this.cjService = cjService;
	}

	private XsService xsService;
	private KcService kcService;

	public void setXsService(XsService xsService) {
		this.xsService = xsService;
	}

	public void setKcService(KcService kcService) {
		this.kcService = kcService;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String execute() throws Exception {
		List list1 = xsService.findAll(1, xsService.findXsSize());
		List list2 = kcService.findAll(1, kcService.findKcSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list1", list1);
		request.put("list2", list2);
		System.out.println(list1.isEmpty()+"\n***");
		System.out.println(list1.isEmpty());
		return SUCCESS;
	}

	public String addorupdateXscj() throws Exception {
		Cjb cj1 = null;
		CjbId cjId1 = new CjbId();
		cjId1.setXh(cj.getId().getXh());
		cjId1.setKch(cj.getId().getKch());
		if (cjService.getXsCj(cj.getId().getXh(), cj.getId().getKch()) == null) {
			cj1 = new Cjb();
			cj1.setId(cjId1);
		} else {
			cj1 = cjService.getXsCj(cj.getId().getXh(), cj.getId().getKch());
		}
		Kcb kc1 = kcService.find(cj.getId().getKch());
		cj1.setCj(cj.getCj());
		if (cj.getCj() > 60 || cj.getCj() == 60) {
			cj1.setXf(kc1.getXf());
		} else
			cj1.setXf(0);
		cjService.saveorupdateCj(cj1);
		return SUCCESS;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String xscjInfo() throws Exception{
		List list=cjService.findAllCj(this.getPageNow(), this.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list", list);
		Pager page=new Pager(this.getPageNow(),cjService.findCjSize());
		System.out.println(cjService.findCjSize());
		request.put("page", page);
		return SUCCESS;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String findXscj() throws Exception{
		List list=cjService.getXsCjList(cj.getId().getXh());
		if(list.size()>0){
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("list", list);
			return SUCCESS;
		}else
			return ERROR;
	}
	public String deleteOneXscj() throws Exception{
		String xh=cj.getId().getXh();
		String kch=cj.getId().getKch();
		System.out.println(xh+"**"+kch);
		cjService.deleteCj(xh, kch);
		return SUCCESS;
	}
}
