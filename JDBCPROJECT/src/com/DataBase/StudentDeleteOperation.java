package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class StudentDeleteOperation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Enter the Student id");
	int std=sc.nextInt();
	try {
		Connection co =DriverManager.getConnection("jdbc:mysql://localhost:3306/kbp","root","Nishant@1308");
		
	Statement st=co.createStatement();
	ResultSet rs=st.executeQuery("select id from student_info");
	boolean found =false;
	while(rs.next()) {
		int ids=rs.getInt("id");
		
		while(std==ids) {
			PreparedStatement pst=co.prepareStatement("delete from student_info where id=?");
			pst.setInt(1, ids);
		int a=	pst.executeUpdate();
		System.out.println("done"+a);
			found = true;
			break;
		
	}
		
	}
	if(!found) {
		System.out.println("invalide id");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
