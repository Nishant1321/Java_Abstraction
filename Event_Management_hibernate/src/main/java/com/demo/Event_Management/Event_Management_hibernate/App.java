package com.demo.Event_Management.Event_Management_hibernate;

/**
 * Hello world!
 *
 */
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class App 
{
	static Scanner sc= new Scanner(System.in);
	
		
		

	
    public static void main( String[] args )
    {
    	SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();    
    	Session sn= factory.getCurrentSession();
    	Transaction transaction=sn.beginTransaction();
    	
    	
    	  EventOrganizer eo= new EventOrganizer();
    		System.out.println("Eneter the name for org_name ");
    		eo.setOrg_name(sc.next());
    		System.out.println("Eneter the name for org_number ");
    		eo.setPhoneNumber(sc.nextLong());
    		System.out.println("Eneter the name for org_Address ");
    		eo.setOrg_address(sc.next());
    		System.out.println("Eneter the name for org_email ");
    		eo.setOrg_email(sc.next());
    		System.out.println("Eneter the name for org_password ");
    		eo.setPassword(sc.next());
    	
    		
    		  
    		List<EventOrganizer> evo=new ArrayList<>();
    		evo.add(eo);
    		
    		
//    		
//    	 	System.out.println("Enter the email ");
//    		String org_email=sc.next();
//    		System.out.println("Enter the Password");
//    		String password=sc.next();
//    	
//    		for(  EventOrganizer us:evo) {
//        		String existingPassword=us.getPassword();
//        		String existingName=us.getOrg_email();
//        		if(existingPassword.equals(password)&&existingName.equals(org_email)) {
//        		System.out.println("Succesfully Login");
//    }else {
//    	System.out.println("wrong password");
//    }
//
//        	}
    		 
    	
    	
    	
    	
//    	transaction.commit();
//    	System.out.println("done");
    	
    //	sn.close();
    //	factory.close();
    	
//    	
//    	Session sn1= factory.getCurrentSession();
//    	Transaction transaction1=sn1.beginTransaction();
    	
    	Customer cm=new Customer();
    	System.out.println("Eneter the name for cust_name ");
    	cm.setCust_name(sc.next());
    	System.out.println("Eneter the name for cust_number ");
    	cm.setPhoneNumber(sc.nextLong());
    	System.out.println("Eneter the name for cust_Address ");
    	cm.setCust_address(sc.next());
    	System.out.println("Eneter the name for cust_email ");
    	cm.setCust_email(sc.next());
    	System.out.println("Eneter the name for cust_password ");
    	cm.setPassword(sc.next());
    	
    
   	 
    	List<Customer> ctm= new ArrayList<Customer>();
    	ctm.add(cm);
    	
    	System.out.println("Registration successfully");
    	
    	
    	
    	
//    	System.out.println("Enter the email ");
//		String cust_email=sc.next();
//		System.out.println("Enter the Password");
//		String cust_password=sc.next();
//	
//		for( Customer cu: ctm) {
//    		String existingPassword=cu.getPassword();
//    		String existingName=cu.getCust_email();
//    		if(existingPassword.equals( cust_password)&&existingName.equals(cust_email)) {
//    		System.out.println("Succesfully Login");
//}else {
//	System.out.println("wrong password");
//}

    	//}
		sn.save(evo);
		sn.save(ctm);
		
		transaction.commit();
    	System.out.println("done");
    	
    	sn.close();
    	factory.close();
    	
    	
    }
   

}
