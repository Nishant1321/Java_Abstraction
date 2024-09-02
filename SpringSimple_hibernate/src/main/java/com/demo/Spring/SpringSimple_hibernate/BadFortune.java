package com.demo.Spring.SpringSimple_hibernate;

public class BadFortune implements Fortune {

	@Override
	public String getFortune() {
		return "bad days";
	}

}
