package com.demos.constructor;

public class Cricket implements Coach{
	private Fortune fortune;
	

	public Cricket(Fortune fortune) {
		
		this.fortune = fortune;
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "batting";
	}

	@Override
	public String getDiaet() {
		// TODO Auto-generated method stub
		return "milk";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune() ;
	}

}
