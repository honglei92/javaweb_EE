package org.model;

import java.io.Serializable;

public class Cjb implements Serializable{
	private static final long serialVersionUID = 1L;
	private CjbId id;
	private int cj;
	private int xf;
	public Cjb(){}
	public Cjb(CjbId id){
		this.id=id;
	}
	public Cjb(CjbId id,int cj,int xf){
		this.cj=cj;
		this.xf=xf;
		this.id=id;
	}
	public CjbId getId() {
		return id;
	}
	public void setId(CjbId id) {
		this.id = id;
	}
	public int getCj() {
		return cj;
	}
	public void setCj(int cj) {
		this.cj = cj;
	}
	public int getXf() {
		return xf;
	}
	public void setXf(int xf) {
		this.xf = xf;
	}
}
