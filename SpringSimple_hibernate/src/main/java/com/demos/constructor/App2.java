package com.demos.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("config_Constuct_coach.xml");
	Cricket ct=	context.getBean("cricket",Cricket.class);
	System.out.println(ct.getWorkout());
	System.out.println(ct.getDiaet());
	System.out.println(ct.getFortune());
	
Football ft=	context.getBean("football",Football.class);
System.out.println(ft.getWorkout());
System.out.println(ft.getDiaet());
System.out.println(ft.getFortune());
	
	}

}
