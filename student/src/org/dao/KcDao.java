package org.dao;

import java.util.List;

import org.model.Kcb;

public interface KcDao {
	public Kcb find(String kch);
	public List findAll(int pageNow,int pageSize);
	public int findKcSize();
	public void save(Kcb kc);
}
