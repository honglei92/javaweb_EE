package org.dao;

import java.util.List;

import org.model.Cjb;

public interface CjDao {
	public void saveorupdateCj(Cjb cj);
	public void deleteCj(String xh,String kch);
	public Cjb getXsCj(String xh,String kch);
	public List findAll(int pageNow,int pageSize);
	public List getXsCjList(String xh);
	public List getKcCjList(String kch);
	public void deleteOneXsCj(String xh);
	public void deleteOneKcInfo(String kch);
	public int findCjSize();
}
