package org.service;

import java.util.List;

import org.model.Xsb;

public interface XsService {
	public void save(Xsb xs);
	public void update(Xsb xs);
	public void delete(String xh);
	public Xsb find(String xh);
	public List findAll(int pageNow ,int pageSize);
	public int findXsSize();
}
