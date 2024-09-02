package com.demo.Annotation_Spring.Annotation_Spring_maven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
      Cricket ct= (Cricket)context.getBean("cricket");
       System.out.println(ct.getFortune());
       System.out.println(ct.getDiaet());
       System.out.println(ct.getWorkout());
       
       FootBall ft= context.getBean("footBall",FootBall.class);
       System.out.println(ft.getFortune());
       System.out.println(ft.getDiaet());
       System.out.println(ft.getWorkout());
       
    }
}
