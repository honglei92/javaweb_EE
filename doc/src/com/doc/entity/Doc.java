package com.doc.entity;

import java.io.Serializable;

public class Doc implements Serializable{
	private static final long serialVersionUID = -3644604944888263552L;
	private int iddoc;
	private String username;
	private String docname;
	private String docpath;
	private String docdescription;
	private String beizhu;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public int getIddoc() {
		return iddoc;
	}
	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	public String getDocpath() {
		return docpath;
	}
	public void setDocpath(String docpath) {
		this.docpath = docpath;
	}
	public String getDocdescription() {
		return docdescription;
	}
	public void setDocdescription(String docdescription) {
		this.docdescription = docdescription;
	}
	
}
