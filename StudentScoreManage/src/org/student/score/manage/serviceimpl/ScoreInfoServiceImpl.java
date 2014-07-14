package org.student.score.manage.serviceimpl;

import java.util.List;

import org.student.score.manage.dao.ScoreInfoDao;
import org.student.score.manage.model.ScoreInfo;
import org.student.score.manage.service.ScoreInfoService;

public class ScoreInfoServiceImpl implements ScoreInfoService {

	//对ScoreInfoDao进行依赖注入
	private ScoreInfoDao scoreDao;
	
	public void setScoreDao(ScoreInfoDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	@Override
	public ScoreInfo find(String sid, String cid) {
		// TODO Auto-generated method stub
		return scoreDao.find(sid, cid);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findByCid(String cid) {
		// TODO Auto-generated method stub
		return scoreDao.findByCid(cid);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findBySid(String sid) {
		// TODO Auto-generated method stub
		return scoreDao.findBySid(sid);
	}

	@Override
	public void save(ScoreInfo scoreInfo) {
		// TODO Auto-generated method stub
		scoreDao.save(scoreInfo);
	}

	@Override
	public void delete(String sid, String cid) {
		// TODO Auto-generated method stub
		scoreDao.delete(sid, cid);
	}

	@Override
	public void deleteOneScore(String sid) {
		// TODO Auto-generated method stub
		scoreDao.deleteOneScore(sid);
	}

	@Override
	public void deleteOneCourse(String cid) {
		// TODO Auto-generated method stub
		scoreDao.deleteOneCourse(cid);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return scoreDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findScoreSize() {
		// TODO Auto-generated method stub
		return scoreDao.findScoreSize();
	}

}
