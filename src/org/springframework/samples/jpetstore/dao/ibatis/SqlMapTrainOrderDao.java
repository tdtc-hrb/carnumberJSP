package org.springframework.samples.jpetstore.dao.ibatis;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.samples.jpetstore.dao.TrainOrderDao;
import org.springframework.samples.jpetstore.domain.TrainOrder;

public class SqlMapTrainOrderDao extends SqlMapClientDaoSupport implements
		TrainOrderDao {
	private Logger logger;
	
	public SqlMapTrainOrderDao() {
		// TODO Auto-generated constructor stub
		logger = Logger.getLogger(this.getClass());
	}
	
	public TrainOrder getCar(int trainNumber, int seriaryNumber)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return (TrainOrder) getSqlMapClientTemplate().queryForObject("getCar", trainNumber, seriaryNumber);
	}

	public TrainOrder getCar(int sn) throws DataAccessException {
		// TODO Auto-generated method stub
		return (TrainOrder) getSqlMapClientTemplate().queryForObject("getCar", sn);
	}

	public List getCarnumberList(String year, String month, int trainNumber)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		trainOrder.setTrainNumber(trainNumber);
		return getSqlMapClientTemplate().queryForList("getCarnumberList", trainOrder);
	}

	public List getYearList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("getYearList", null);
	}
	
	public List getMonthList() throws DataAccessException {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("getMonthList", null);
	}
	
	public List getTrainNumberList(String year, String month)
			throws DataAccessException {
		// TODO Auto-generated method stub
		TrainOrder trainOrder = new TrainOrder();
		trainOrder.setYearLevel2(year);
		trainOrder.setMonthLevel3(month);
		return getSqlMapClientTemplate().queryForList("getTrainNumberList", trainOrder);
	}
}
