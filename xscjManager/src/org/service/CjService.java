package org.service;

import java.util.List;

import org.model.Cjb;

public interface CjService {
	public void saveorupdateCj(Cjb cj);
	public void deleteCj(String xh,String kch);
	public Cjb getXsCj(String xh,String kch);
	@SuppressWarnings("rawtypes")
	public List findAllCj(int pageNow,int pageSize);
	@SuppressWarnings("rawtypes")
	public List getXsCjList(String xh);
	@SuppressWarnings("rawtypes")
	public List getKcCjList(String kch);
	public void deleteOneXsCj(String xh);
	public void deleteOnekcInfo(String kch);
	public int findCjSize();
}
