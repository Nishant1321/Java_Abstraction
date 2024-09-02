package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	Scanner sc= new Scanner(System.in);
	Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/kbp","root","Nishant@1308");
PreparedStatement st =co.prepareStatement("delete from info where id =?;");
System.out.println("Enter the id for delete :");
int id =sc.nextInt();
st.setInt(1, id);
st.executeUpdate();
System.out.println("done");


} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

	}

}
