package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}

try {
	Connection	co = DriverManager.getConnection("jdbc:mysql://localhost :3306/kbp","root","Nishant@1308");
	Statement st = co.createStatement();
	st.executeUpdate("alter table students drop column age ");
	System.out.println("done");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
