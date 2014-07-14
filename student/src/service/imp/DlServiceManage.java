package service.imp;

import org.dao.DlDao;
import org.model.Dlb;
import org.service.DlService;

public class DlServiceManage implements DlService{
	private DlDao dlDao;
    public void setDlDao(DlDao dlDao){
    	this.dlDao=dlDao;
    }
	@Override
	public void save(Dlb user) {
		dlDao.save(user);
	}

	@Override
	public Dlb find(String xh, String kl,String role) {
		return dlDao.find(xh, kl, role);
	}

	@Override
	public boolean existXh(String xh) {
		return dlDao.exitXh(xh);
	}
}

