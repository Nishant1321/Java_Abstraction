package com.demo.Spring.SpringSimple_hibernate;

public class Football implements Coach {
	private Fortune fortune;
	

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Running";
	}

	@Override
	public String getDailyDiaet() {
		// TODO Auto-generated method stub
		return "Fruits";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
