package com.DataBase;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
 static ConnectionDemo co;
public static ConnectionDemo getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		co= (ConnectionDemo) DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Nishant@1308");
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return co;
}
}
