package org.model;

import java.io.Serializable;

public class Zyb implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String zym;
	private Integer rs;
	private String fdy;
	public Zyb(){}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getZym() {
		return zym;
	}
	public void setZym(String zym) {
		this.zym = zym;
	}
	public Integer getRs() {
		return rs;
	}
	public void setRs(Integer rs) {
		this.rs = rs;
	}
	public String getFdy() {
		return fdy;
	}
	public void setFdy(String fdy) {
		this.fdy = fdy;
	}
	
}
