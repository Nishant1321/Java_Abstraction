package com.demo.Voting.VotingSystem_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.candidate.Candidate;
import com.demo.candidate.CandidateOperation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	
    	
    	Candidate cd= new Candidate ();
    	CandidateOperation co= new CandidateOperation();
//    	cd.setName("nishant");
//    	cd.setAge(21);
//    	cd.setParty("BJP");
    	System.out.println("enter the name for add cadidate");
    	co.setCandidate();
    	
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session currentSession=   factory.getCurrentSession();
     Transaction transaction=currentSession.beginTransaction();
     currentSession.save(cd);
     transaction.commit();
     System.out.println("done");
     currentSession.close();
     factory.close();
    }
}
