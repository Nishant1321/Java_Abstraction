package com.demo.springs;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App2 {

	
	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("config2.xml");
Student st=(Student) context.getBean("students");
System.out.println(st.getName());
System.out.println(st.getRollNumber());
System.out.println(st.getCity());

Student st1=(Student) context.getBean("student1");
System.out.println(st1.getName());
System.out.println(st1.getRollNumber());
System.out.println(st1.getCity());

	}
}
