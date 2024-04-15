package com.demo.Adhar.AdharCard_hibernate;

import java.util.ArrayList;
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
public class App2
{
    public static void main( String[] args )
    {
        
    	SessionFactory factory =new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();    
  Session sn= factory.getCurrentSession();
   //	Session sn= factory.openSession();
	Transaction transaction=sn.beginTransaction();
    	
    	
    	
//    	Contact cn= new Contact();
//    	cn.setContact_id(1);
//    	cn.setContact_number(9359452);
//    	
//    	Contact cn1= new Contact();
//    	cn1.setContact_id(2);
//   	cn1.setContact_number(586455);
////    	
//    	Contact cn2= new Contact();
//    	cn2.setContact_id(3);
//    	cn2.setContact_number(4569875);
//    	
//    	Contact cn3= new Contact();
//    	cn3.setContact_id(4);
//    	cn3.setContact_number(248943);
    	
//    	Contact cn4= new Contact();
//    	cn4.setContact_id(5);
//    	cn4.setContact_number(8653);
//    	
//    	Contact cn5= new Contact();
//    	cn5.setContact_id(6);
//    	cn5.setContact_number(789456);
    	
    	
    	Contact cn6= new Contact();
    	cn6.setContact_id(10);
    	cn6.setContact_number(78945);
    	
    	Contact cn7= new Contact();
    	cn7.setContact_id(11);
    	cn7.setContact_number(12345);
    	
    	List<Contact> contactList= new ArrayList<Contact>();
//    	contactList.add(cn);
//    	contactList.add(cn1);
//    	contactList.add(cn2);
//    	contactList.add(cn3);
//    	contactList.add(cn4);
//    	contactList.add(cn5);
    	contactList.add(cn6);
    	contactList.add(cn7);
    	
    	
   	//Voter vt= new Voter();
//    	vt.setId(6);
//    	vt.setName("Vishal");
//    	vt.setContact(contactList);
//    	
//    	Voter vt1= new Voter();
//    	vt1.setId(7);
//    	vt1.setName("Aniket");
//    	vt1.setContact(contactList);
    	
    	Voter vt3= new Voter();
    	vt3.setId(12);
    	vt3.setName("ganesh");
    	vt3.setContact(contactList);
    	
    	
//    	cn.setVoter(vt);
//    	cn1.setVoter(vt);
//    	cn2.setVoter(vt2);
//    	cn3.setVoter(vt1);
    	cn6.setVoter(vt3);
    	cn7.setVoter(vt3);
    	
    	
    	
    	//sn.save(vt);
    	sn.save(vt3);
    	//sn.save(cn);
//    	sn.save(cn1);
//    	sn.save(cn2);
//    	sn.save(cn3);
//sn.save(cn4);
//sn.save(cn5);
  	
   	
	//fetch the data 
//	Voter voter=sn.get(Voter.class,1);
//	System.out.println(voter.getName());
    	
//    	Query q= sn.createQuery("from Voter where id=1 ");
//    	List<Voter> list=q.list();
//    	 for(Voter vt:list) {
//    		 System.out.println(vt.getName());
//    	 }
    	 

    	
   	//taking value as user
   	
//   	Scanner sc = new Scanner(System.in);
//   	System.out.println("Enter the Choice");
//   	int ch =sc.nextInt();
   	
   	
//   Query q=	sn.createQuery("from Voter where id=:ch");
//   q.setParameter("ch", ch);
//   List<Voter> list=q.list();
//   for(Voter vt:list) {
//	   System.out.println(vt.getName());
//   }
   	
   	//fetch contact number from one to many
//   Query q=	sn.createQuery("from Contact c where c.voter.id= :ch");
//   
//  q.setParameter("ch", ch);
//  List<Contact> contacts=q.list();
//  for(Contact ct: contacts) {
//	  Voter vt=ct.getVoter();
//	  System.out.println(vt.getName()+" contact Number : "+ct.getContact_number());
//	  
//  }
  
   	//fetch Voter from many to one 
   	
   	
//    Query q=	sn.createQuery("from Voter v where v.contact.Contact_id= :ch");
//  
// q.setParameter("ch", ch);
// List<Voter> voters=q.list();
// for(Voter vt: voters) {
//	  Contact ct=(Contact) vt.getContact();
//	  System.out.println(vt.getName()+" contact Number : "+ct.getContact_number());
//	  
// }
   	//delete the table value
// Query q=	sn.createQuery("delete from Contact c where c.voter.id= :ch");
// 
// q.setParameter("ch", ch);
//   	q.executeUpdate();
   	
   	//update table value
//    Query q=	sn.createQuery("update  Voter set name=:name  where id= :ch");
//   	
//    
//    System.out.println("Enter the Name");
//    String next=sc.next();
//    q.setParameter("ch", ch);
//    q.setParameter("name", next);
//    
//    q.executeUpdate();
  	transaction.commit();
    	System.out.println("done ");
    	
    	sn.close();
    	factory.close();
    	
    }
}
