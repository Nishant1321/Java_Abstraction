package com.demo.Emp.Employee_hibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();    
    	  Session sn= factory.getCurrentSession();
    	  
    		Transaction transaction=sn.beginTransaction();
    		

//    		Employe em= new Employe();
//    		em.setEmp_id(1);
//    		em.setEmp_name("Nishant");
//   		em.setEmp_salary(1500000.00);
//    		
//    		Employe em1= new Employe();
//    		em1.setEmp_id(2);
//    		em1.setEmp_name("Dipak");
//    		em1.setEmp_salary(1000000.00);
//    		
//    		Employe em2= new Employe();
//    		em2.setEmp_id(3);
//    		em2.setEmp_name("Aniket");
//    		em2.setEmp_salary(200000.00);
//    		
//    		sn.save(em);
//    		sn.save(em1);
//    		sn.save(em2);
    		
    		int threshold=300000;
    		Query q=sn.createQuery("from Employe e where e.emp_salary>:threshold");
    		q.setParameter("threshold", threshold);
    		List<Employe>list=q.list();
    		for(Employe em:list) {
   			System.out.println(em.getEmp_salary()+"Emp_name :"+em.getEmp_name());
   		}
    		
    		
    		
    		transaction.commit();
    		
    		
    		
    		
    		System.out.println("done");
    		
    		sn.close();
    		factory.close();
    	
    	
    	
    }
}
