package com.emp.TCS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Employee emp = new Employee();
    	emp.setEmpName("nishant");
    	emp.setJoiningDate(new Date());
    	emp.setCity("Satara");
    	
    	FileInputStream fs = new FileInputStream("src/main/java/20220112061110_IMG_4332-01.jpeg");
    	byte[] mg=new byte [fs.available()];
    	fs.read(mg);
    	emp.setImg(mg);
    	
    	 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	 Session currentSession=factory.getCurrentSession();
    	 Transaction ts=currentSession.beginTransaction();
    	 currentSession.save(emp);
    	 ts.commit();
    	 System.out.println("done");
   currentSession.close();
   factory.close();
    
    
    
    }
}
