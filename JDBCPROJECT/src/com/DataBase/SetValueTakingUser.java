package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class SetValueTakingUser {

	public static void main(String[] args) {
	
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
try {
	Scanner sc= new Scanner(System.in);
	Connection co =DriverManager.getConnection("jdbc:mysql://localhost:3306/kbp","root","Nishant@1308");
PreparedStatement st = co.prepareStatement("update info set name=? where id=?;");


System.out.println("Enter the name for update");
String name=sc.next();
st.setString(1, name);
System.out.println("Enter the id for update :");
int id = sc.nextInt();
st.setInt(2, id);

st.executeUpdate();
System.out.println("done");





} catch (SQLException e) {
	
	e.printStackTrace();
}


	}

}
