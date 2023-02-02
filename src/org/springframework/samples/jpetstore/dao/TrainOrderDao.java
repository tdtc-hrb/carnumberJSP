package org.springframework.samples.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.jpetstore.domain.TrainOrder;

public interface TrainOrderDao {
	TrainOrder getCar(int trainNumber, int seriaryNumber) throws DataAccessException;
	TrainOrder getCar(int sn) throws DataAccessException;
	
	List getCarnumberList(String year, String month, int trainNumber) throws DataAccessException;
	List getYearList() throws DataAccessException;
	List getMonthList() throws DataAccessException;
	List getTrainNumberList(String year, String month) throws DataAccessException;
}
