package com.demo.Event_Management_website.Event_Management_website_hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session sn = factory.getCurrentSession();
        Transaction transaction = sn.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
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
        
        sn.save(eo); // Save the single EventOrganizer object
        
        System.out.println("Registration successfully");

        System.out.println("Enter the email ");
        String org_email = sc.next();
        System.out.println("Enter the Password");
        String password = sc.next();
        
        transaction.commit();
        System.out.println("Transaction committed successfully");

        sn.close();
        factory.close();
    }
}
