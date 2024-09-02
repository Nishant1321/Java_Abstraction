package com.demo.Event_Management_website.Event_Management_website_hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class AppDemo {
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		 EventOrganizer eo = new EventOrganizer();
	        System.out.println("Enter the name for org_name ");
	        eo.setOrg_name(sc.next());
	        System.out.println("Enter the name for org_number ");
	        eo.setPhoneNumber(sc.nextLong());
	        System.out.println("Enter the name for org_Address ");
	        eo.setOrg_address(sc.next());
	        System.out.println("Enter the name for org_email ");
	        eo.setOrg_email(sc.next());
	        System.out.println("Enter the name for org_password ");
	        eo.setPassword(sc.next());
	        List<EventOrganizer> evo=new ArrayList<EventOrganizer>();
    		evo.add(eo);
	        
	        	        
	        System.out.println("Registration successfully");

	        System.out.println("Enter the email ");
	        String org_email = sc.next();
	        System.out.println("Enter the Password");
	        String password = sc.next();
	       
	        
	    	for( EventOrganizer us:evo) {
	    		String existingPassword=us.getPassword();
	    		String existingName=us.getOrg_email();
	    		if(existingPassword.equals(password)&&existingName.equals(org_email)) {
	    		System.out.println("Succesfully Login");
	}

	    	}
	}
}  	
	
