package com.rg.bo;

public class HackerBo {

	private int hackerNumber;
	private String hacker;
	private boolean isHacked;
	
	public HackerBo(){}
	
	public HackerBo(int hackerNumber, String hacker, boolean isHacked) {
		super();
		this.hackerNumber = hackerNumber;
		this.hacker = hacker;
		this.isHacked = isHacked;
	}

	public int getHackerNumber() {
		return hackerNumber;
	}

	public void setHackerNumber(int hackerNumber) {
		this.hackerNumber = hackerNumber;
	}

	public String getHacker() {
		return hacker;
	}

	public void setHacker(String hacker) {
		this.hacker = hacker;
	}

	public boolean isHacked() {
		return isHacked;
	}

	public void setHacked(boolean isHacked) {
		this.isHacked = isHacked;
	}
	
}
