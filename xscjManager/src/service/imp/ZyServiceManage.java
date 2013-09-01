package service.imp;

import java.util.List;

import org.dao.ZyDao;
import org.model.Zyb;
import org.service.ZyService;

import dao.imp.ZyDaoImp;

public class ZyServiceManage implements ZyService{
	private ZyDaoImp zyDao;
	public void setZyDao(ZyDao zyDao) {
		this.zyDao = (ZyDaoImp) zyDao;
	}

	@Override
	public void save(Zyb zy) {
		zyDao.save(zy);
		
	}

	@Override
	public Zyb getOneZy(Integer zyId) {
		return zyDao.getOneZy(zyId);
	}

	@Override
	public List getAll() {
		return zyDao.getAll();
	}
	
}
