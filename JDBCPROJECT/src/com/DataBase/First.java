package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	String url ="jdbc:mysql://localhost:3306/kbp";
	String username="root";
	String pass="Nishant@1308";
	
	try {
		Connection co=DriverManager.getConnection(url,username,pass);
		Statement st =co.createStatement();
		ResultSet executeQuery =st.executeQuery("select * from info");
		while(executeQuery.next()) {
			int id = executeQuery.getInt("id");
			String name=executeQuery.getString("name");
			System.out.println("id :"+id+"\n name :"+name);
			
		}
	
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
	}


