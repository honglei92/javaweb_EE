package org.model;

import java.io.Serializable;

public class Dlb implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String xh;
	private String kl;
	private String role;
	
	public Dlb(){}
	public Dlb(String xh,String kl,String role){
		this.xh=xh;
		this.kl=kl;
		this.role=role;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getKl() {
		return kl;
	}
	public void setKl(String kl) {
		this.kl = kl;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
