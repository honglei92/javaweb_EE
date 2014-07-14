package org.dao;

import java.util.List;

import org.model.Zyb;

public interface ZyDao {
	public void save(Zyb zy);
	public Zyb getOneZy(Integer zyId);
	public List getAll();
}
