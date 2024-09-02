package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstFetch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String url="jdbc:mysql://localhost:3306/kbp";
String username="root";
String pass="Nishant@1308";
try {
	Connection co=DriverManager.getConnection(url,username,pass);
	Statement st=co.createStatement();
	ResultSet executeQuery=st.executeQuery("select * from students");
	while(executeQuery.next()) {
		int College_Id=executeQuery.getInt("College_Id");
		int marks =executeQuery.getInt("marks");
		String name=executeQuery.getString("Name");
		int age=executeQuery.getInt("age");
		System.out.println("College_Id : "+College_Id+"\n marks : "+marks+"\n name : "+name+"\n age : "+age);
		
	}
	
} catch (SQLException e) {
	
	e.printStackTrace();
}
	}

}
