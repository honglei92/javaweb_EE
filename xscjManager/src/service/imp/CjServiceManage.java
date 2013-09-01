package service.imp;

import java.util.List;

import org.dao.CjDao;
import org.model.Cjb;
import org.service.CjService;

public class CjServiceManage implements CjService{
	private CjDao cjDao;
	public void setCjDao(CjDao cjDao) {
		this.cjDao = cjDao;
	}

	@Override
	public void saveorupdateCj(Cjb cj) {
		cjDao.saveorupdateCj(cj);
		
	}

	@Override
	public void deleteCj(String xh, String kch) {
		cjDao.deleteCj(xh, kch);
		
	}

	@Override
	public Cjb getXsCj(String xh, String kch) {
		return cjDao.getXsCj(xh, kch);
	}

	@Override
	public List findAllCj(int pageNow, int pageSize) {
		return cjDao.findAll(pageNow, pageSize);
	}

	@Override
	public List getXsCjList(String xh) {
		return cjDao.getXsCjList(xh);
	}

	@Override
	public List getKcCjList(String kch) {
		return cjDao.getKcCjList(kch);
	}

	@Override
	public void deleteOneXsCj(String xh) {
		cjDao.deleteOneXsCj(xh);
		
	}

	@Override
	public void deleteOnekcInfo(String kch) {
		cjDao.deleteOneKcInfo(kch);
		
	}

	@Override
	public int findCjSize() {
		return cjDao.findCjSize();
	}
	
}
