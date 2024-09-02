package com.demo.Spring_CompScan.Component_Scan_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach {
	
	private Fortune fortune;
	
@Autowired
@Qualifier("badFortune")
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Batting";
	}

	@Override
	public String getDiaet() {
		// TODO Auto-generated method stub
		return "milk";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
