package org.springframework.samples.jpetstore.domain;

import java.io.Serializable;

public class TrainOrder implements Serializable {
	private int trainNumber;
	private int seriaryNumber;
	private String carNumber;
	private String carMarque;
	private double carryWeight1;
	private double selfWeight1;
	private String pastTime;
	private String outFlag;
	private boolean badFlag;
	private String yearLevel2;
	private String monthLevel3;
	private int sn;
	
	
	/* JavaBeans Properties */
	
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public int getSeriaryNumber() {
		return seriaryNumber;
	}
	public void setSeriaryNumber(int seriaryNumber) {
		this.seriaryNumber = seriaryNumber;
	}
	
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber1(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public String getCarMarque() {
		return carMarque;
	}
	public void setCarMarque(String carMarque) {
		this.carMarque = carMarque;
	}
	
	public double getCarryWeight1() {
		return carryWeight1;
	}
	public void setCarryWeight1(double carryWeight1) {
		this.carryWeight1 = carryWeight1;
	}
	
	public double getSelfWeight1() {
		return selfWeight1;
	}
	public void setSelfWeight1(double selfWeight1) {
		this.selfWeight1 = selfWeight1;
	}
	
	public String getPastTime() {
		return pastTime;
	}
	public void setPastTime(String pastTime) {
		this.pastTime = pastTime;
	}
	
	public String getOutFlag() {
		return outFlag;
	}
	public void setOutFlag(String outFlag) {
		this.outFlag = outFlag;
	}
	
	public boolean isBadFlag() {
		return badFlag;
	}
	public void setBadFlag(boolean badFlag) {
		this.badFlag = badFlag;
	}
	private int getBadFlagAsInt() {
		// TODO Auto-generated method stub
		return badFlag ? 1 : 0;
	}
	
	public String getYearLevel2() {
		return yearLevel2;
	}
	public void setYearLevel2(String yearLevel2) {
		this.yearLevel2 = yearLevel2;
	}
	
	public String getMonthLevel3() {
		return monthLevel3;
	}
	public void setMonthLevel3(String monthLevel3) {
		this.monthLevel3 = monthLevel3;
	}
	
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	
}
