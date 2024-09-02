package com.demos.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demos.constructor.Students;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("config_car.xml");
		Tata t=  (Tata) context.getBean("tata",Tata.class);
		System.out.println(t.milage());
		System.out.println(t.seater());
		System.out.println(t.getCardetails());
		
		
		Toyato to=  (Toyato) context.getBean("toyato",Toyato.class);
		System.out.println(to.milage());
		System.out.println(to.seater());
		System.out.println(to.getCardetails());
		
	}

}
