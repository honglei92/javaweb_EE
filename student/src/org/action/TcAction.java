package org.action;

import java.util.Map;

import org.model.Dlb;
import org.service.DlService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TcAction extends ActionSupport{
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
		Map session=ActionContext.getContext().getSession();
		if(session!=null){
//			session.clear();
			session.remove("user");
			System.out.println(session.isEmpty());
			Map session1=ActionContext.getContext().getSession();
			return SUCCESS;
		
		}else
			return ERROR;
	}
}
