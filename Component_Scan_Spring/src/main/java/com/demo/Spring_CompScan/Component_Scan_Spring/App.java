package com.demo.Spring_CompScan.Component_Scan_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	Cricket ct =(Cricket) context.getBean("cricket");
    	System.out.println(ct.getFortune());
    	System.out.println(ct.getWorkout());
    	System.out.println(ct.getDiaet());
    	
    	FootBall ft =(FootBall) context.getBean("footBall");
    	System.out.println(ft.getFortune());
    	System.out.println(ft.getDiaet());
    	System.out.println(ft.getWorkout());
    	
    }
}
