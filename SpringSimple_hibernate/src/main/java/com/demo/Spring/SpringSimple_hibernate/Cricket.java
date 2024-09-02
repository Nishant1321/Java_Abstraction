package com.demo.Spring.SpringSimple_hibernate;

public class Cricket implements Coach {
	private Fortune fortune;
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Bating";
	}

	@Override
	public String getDailyDiaet() {
		// TODO Auto-generated method stub
		return "vegitable";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
