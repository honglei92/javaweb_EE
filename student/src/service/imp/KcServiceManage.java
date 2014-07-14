package service.imp;

import java.util.List;

import org.dao.KcDao;
import org.model.Kcb;
import org.service.KcService;

public class KcServiceManage implements KcService{
	private KcDao kcDao;
	public void setKcDao(KcDao kcDao) {
		this.kcDao = kcDao;
	}

	@Override
	public Kcb find(String kch) {
		return kcDao.find(kch);
	}

	@Override
	public void save(Kcb kc) {
		kcDao.save(kc);
		
	}

	@Override
	public List findAll(int pageNow, int pageSize) {
		return kcDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findKcSize() {
		return kcDao.findKcSize();
	}
	
}
