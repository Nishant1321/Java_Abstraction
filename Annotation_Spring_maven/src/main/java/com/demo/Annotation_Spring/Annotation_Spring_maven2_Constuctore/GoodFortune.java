package com.demo.Annotation_Spring.Annotation_Spring_maven2_Constuctore;

import org.springframework.stereotype.Component;


public class GoodFortune implements Fortune{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Good Days";
	}

}
