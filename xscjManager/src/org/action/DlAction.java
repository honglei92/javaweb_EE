package org.action;

import java.util.Map;

import org.model.Dlb;
import org.service.DlService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DlAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private DlService dlservice;
	private Dlb dl;
	public DlService getDlservice() {
		return dlservice;
	}
	public void setDlservice(DlService dlservice) {
		this.dlservice = dlservice;
	}
	public Dlb getDl() {
		return dl;
	}
	public void setDl(Dlb dl) {
		this.dl = dl;
	}
	public String execute() throws Exception{
		System.out.println(dl.getXh()+dl.getKl());
		Dlb user=dlservice.find(dl.getXh(), dl.getKl());
		if(user!=null){
			Map session=ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		}else
			return ERROR;
	}
}
