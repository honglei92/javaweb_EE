package org.model;

import java.io.Serializable;

public class Kcb implements Serializable{
	private static final long serialVersionUID = 1L;
	private String kch;
	private String kcm;
	private Short kxxq;
	private Short xs;
	private int xf;
	public Kcb(){}
	public Kcb(String kcm,Short kxxq,Short xs,int xf){
		this.kcm=kcm;
		this.kxxq=kxxq;
		this.xf=xf;
		this.xs=xs;
	}
	public String getKch() {
		return kch;
	}
	public void setKch(String kch) {
		this.kch = kch;
	}
	public String getKcm() {
		return kcm;
	}
	public void setKcm(String kcm) {
		this.kcm = kcm;
	}
	public Short getKxxq() {
		return kxxq;
	}
	public void setKxxq(Short kxxq) {
		this.kxxq = kxxq;
	}
	public Short getXs() {
		return xs;
	}
	public void setXs(Short xs) {
		this.xs = xs;
	}
	public int getXf() {
		return xf;
	}
	public void setXf(int xf) {
		this.xf = xf;
	}
}
