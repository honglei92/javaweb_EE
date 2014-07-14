package service.imp;

import java.util.List;

import org.dao.CjDao;
import org.dao.XsDao;
import org.model.Xsb;
import org.service.XsService;

public class XsServiceManage implements XsService{
	private XsDao xsDao;
	private CjDao cjDao;
	public void setXsDao(XsDao xsDao) {
		this.xsDao = xsDao;
	}
	public void setCjDao(CjDao cjDao) {
		this.cjDao = cjDao;
	}

	@Override
	public void save(Xsb xs) {
		xsDao.save(xs);
		
	}

	@Override
	public void update(Xsb xs) {
		xsDao.update(xs);
		
	}

	@Override
	public void delete(String xh) {
		xsDao.delete(xh);
		cjDao.deleteOneXsCj(xh);
	}

	@Override
	public Xsb find(String xh) {
		return xsDao.find(xh);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		return xsDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findXsSize() {
		return xsDao.findXsSize();
	}
	
}
