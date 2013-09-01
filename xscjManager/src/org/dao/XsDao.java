package org.dao;

import java.util.List;

import org.model.Xsb;

public interface XsDao {
	public void save(Xsb xs);
	public void delete(String xh);
	public void update(Xsb xs);
	public Xsb find(String xh);
	@SuppressWarnings("rawtypes")
	public List findAll(int pageNow,int pageSize);
	public int findXsSize();
}
