package org.model;

import java.io.Serializable;
import java.util.Date;

public class Xsb implements Serializable{
	private static final long serialVersionUID = 1L;
	private String xh;
	private Zyb zyb;
	private String xm;
	private boolean xb;
	private Date cssj;
	private Integer zxf;
	private String bz;
	private String zp;
	public Xsb() {}
	public Xsb(String xh,Zyb zyb,String xm,boolean xb,Date cssj,Integer zxf,String zp,String bz){
		this.xh=xh;
		this.bz=bz;
		this.xm=xm;
		this.xb=xb;
		this.zyb=zyb;
		this.cssj=cssj;
		this.zxf=zxf;
		this.zp=zp;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public Zyb getZyb() {
		return zyb;
	}
	public void setZyb(Zyb zyb) {
		this.zyb = zyb;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public boolean isXb() {
		return xb;
	}
	public void setXb(boolean xb) {
		this.xb = xb;
	}
	public Date getCssj() {
		return cssj;
	}
	public void setCssj(Date cssj) {
		this.cssj = cssj;
	}
	public Integer getZxf() {
		return zxf;
	}
	public void setZxf(Integer zxf) {
		this.zxf = zxf;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	
}
