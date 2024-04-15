package Voting.system.voters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDemo {
static Connection co;
public static Connection getConnection() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		
		co=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Nishant@1308");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return   co;
	
}
}
