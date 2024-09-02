package com.demos.constructor;

public class Football  implements Coach{
	private Fortune fortune;
	

	public Football(Fortune fortune) {
		
		this.fortune = fortune;
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Running";
	}

	@Override
	public String getDiaet() {
		// TODO Auto-generated method stub
		return "fruits";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
