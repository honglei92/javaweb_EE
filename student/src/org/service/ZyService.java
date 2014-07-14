package org.service;

import java.util.List;

import org.model.Zyb;

public interface ZyService {
	public void save(Zyb zy);
	public Zyb getOneZy(Integer zyId);
	public List getAll();
}
