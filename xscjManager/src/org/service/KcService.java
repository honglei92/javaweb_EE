package org.service;

import java.util.List;

import org.model.Kcb;

public interface KcService {
	public Kcb find(String kch);
	public void save(Kcb kc);
	public List findAll(int pageNow,int pageSize);
	public int findKcSize();
}
