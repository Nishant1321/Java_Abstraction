package com.demo.Product.Product_hibernate;

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
       Product pd= new Product();
       pd.setProduct_id(1);
       pd.setProduct_name("icecream");
       pd.setProduct_price(60.00);
       
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();    
    	  Session sn= factory.getCurrentSession();
    	  Transaction transaction=sn.beginTransaction();
    	  sn.save(pd);
    	  transaction.commit();
    	  System.out.println("done");
    		sn.close();
    		factory.close();
    		
    }
}
