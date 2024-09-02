package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertionValue {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try {
		
		Connection co =DriverManager.getConnection("jdbc:mysql://localhost:3306/kbp","root","Nishant@1308");
	PreparedStatement ct =co.prepareStatement("insert into info(id, name)values(?,?);");
	ct.setInt(1, 6);
	ct.setString(2, "soham");
	ct.setInt(1, 7);
	ct.setString(2, "Adesh");
	
	int a=ct.executeUpdate();
	System.out.println("done"+a+" data inserted");
	
	
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	
} 
}
