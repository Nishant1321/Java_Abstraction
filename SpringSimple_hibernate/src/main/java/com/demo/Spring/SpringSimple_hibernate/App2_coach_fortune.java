package com.demo.Spring.SpringSimple_hibernate;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springs.Student;

public class App2_coach_fortune {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context= new ClassPathXmlApplicationContext("config_dep_Inject.xml");
		Cricket ct = (Cricket) context.getBean("cricket",Cricket.class);
		System.out.println(ct.getDailyWorkOut());
		System.out.println(ct.getDailyDiaet());
		System.out.println(ct.getFortune());
		
		
	Football ft= (Football)	context.getBean("football",Football.class);
	System.out.println(ft.getDailyDiaet());
	System.out.println(ft.getDailyWorkOut());
	System.out.println(ft.getFortune());
	
	}

}
