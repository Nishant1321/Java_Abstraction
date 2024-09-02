package com.demo.Customer.Customer_hibername;

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
//  		Customer ct=new Customer();
//  		ct.setCust_id(1);
//  		ct.setCust_name("Priti");
//  		ct.setCust_age(21);
//  		
//  		Customer ct1=new Customer();
//  		ct1.setCust_id(2);
//  		ct1.setCust_name("Sakshi");
//  		ct1.setCust_age(20);
//  		
//  		sn.save(ct);
//  		sn.save(ct1);
  		Scanner sc = new Scanner(System.in);
      	System.out.println("Enter the Choice");
      	int ch =sc.nextInt();
 		
//  		Query q=sn.createQuery("from Customer");
//  	//	q.setParameter("ch", ch);
//  		List<Customer> list=q.list();
//  		for(Customer ct: list) {
// 			System.out.println("id :"+ct.getCust_id()+"name :"+ct.getCust_name()+"age :"+ct.getCust_age());
////  			
//		}
  		
  		//update 
//  		Query q1=sn.createQuery("update  Customer  set cust_name=:cust_name where  cust_id =:ch");
//  		 System.out.println("Enter the Name");
// 	    String next=sc.next();
//  		q1.setParameter("ch", ch);
//  		q1.setParameter("cust_name", next);
//  		q1.executeUpdate();
		
  		//Delete
  		Query q2=	sn.createQuery("delete from Customer  where cust_id= :ch");
  	
  	q2.setParameter("ch", ch);
 	   	q2.executeUpdate();
  		
  		transaction.commit();
  		System.out.println("done");
  		sn.close();
  		
  		factory.close();
    }
    }

