package com.demo.Adhar.AdharCard_hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();    
    Session sn=factory.openSession();
   // 	Session sn= factory.getCurrentSession();
//    	Transaction transaction=sn.beginTransaction();
//    	Person ps= new Person();
//    	ps.setId(6);
//    	ps.setName("vishal");
//    	
//    	Adhar ad= new Adhar();
//    	
//    	ad.setAdhar_number(123456);
//    	ad.setCity("dilhi");
//    	ps.setAdhar_details(ad);
//    	ad.setPerson(ps);
//    	sn.save(ps);
////    	sn.save(ad);
//    	transaction.commit();
    Person person=sn.get(Person.class,6 );
    
    System.out.println(person.getName());
    
    System.out.println("****************************************");
    
//    Person person2=sn.get(Person.class, 5);
//    System.out.println(person2.getName());
//    
    	System.out.println("done");
    	
    	sn.close();
    	//second level session open
    	Session sn1=factory.openSession();
    	 Person person2=sn1.get(Person.class,6 );
    	    
    	    System.out.println(person2.getName());
    	    sn1.close();
    	factory.close();
    	
    }
}
