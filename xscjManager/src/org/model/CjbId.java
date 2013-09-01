package org.model;

import java.io.Serializable;

public class CjbId implements Serializable{
	private static final long serialVersionUID = 1L;
	private String xh;
	private String kch;
	public CjbId(){}
	public CjbId(String xh,String kch){
		this.kch=kch;
		this.xh=xh;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh2) {
		this.xh = xh2;
	}
	public String getKch() {
		return kch;
	}
	public void setKch(String kch) {
		this.kch = kch;
	}
}
