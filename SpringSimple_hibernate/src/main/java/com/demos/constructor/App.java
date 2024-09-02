package com.demos.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
public static void main(String arg[]) {
	ApplicationContext context= new ClassPathXmlApplicationContext("config_con.xml");
Students st=	(Students) context.getBean("student");
System.out.println(st);

	
}

}
