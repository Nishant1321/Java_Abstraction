package com.demo.Annotation_Spring.Annotation_Spring_maven2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class FootBall implements Coach{
private Fortune fortune;

	public void setFortune(Fortune fortune) {
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
		return "veg";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
