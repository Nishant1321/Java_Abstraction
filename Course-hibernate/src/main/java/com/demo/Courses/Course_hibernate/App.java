package com.demo.Courses.Course_hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

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
    	
    	
    	Student st= new Student();
    	st.setRollNumber(1);   
    	st.setName("nishant");
   
    	
    	Student st1 = new Student();
    	st1.setRollNumber(2);   
    	st1.setName("priti");
    
    	
    	Student st2 = new Student();
    	st2.setRollNumber(3);   
    	st2.setName("Akshata");
    
    	
    	List<Student> stud=new ArrayList<Student>();
    	stud.add(st);
    	stud.add(st1);
    	stud.add(st2);
    	
    	
    	Course cs=new Course();
    	cs.setCourse_id(1);
    	cs.setCourse_name("java");
    
    	
    	Course cs1=new Course();
    	cs1.setCourse_id(2);
    	cs1.setCourse_name("Python");
   
    	
    	Course cs3=new Course();
    	cs3.setCourse_id(3);
    	cs3.setCourse_name("mg");
    
    	
    	List<Course> cor= new ArrayList<Course>();
    	cor.add(cs);
    	cor.add(cs1);
    	cor.add(cs3);
    	
    
    		
    	
    	st.setCourse(cor);
    	st1.setCourse(cor);
    	st2.setCourse(cor);
    	
    	cs.setStudent(stud);
    	cs1.setStudent(stud);
    	cs3.setStudent(stud);
    	
    
    	
    	sn.save(st);
    	sn.save(st1);
    	sn.save(st2);
    	
    	sn.save(cs);
    	sn.save(cs1);
    	sn.save(cs3);
    	
    	transaction.commit();
    	System.out.println("done");
    	
    	sn.close();
    	factory.close();
    	
    }
}


//