package Borrower;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import LibraryManagementSystem.Connect;

public class DatabaseBarrower {
static Scanner sc= new Scanner(System.in);
public static void saveToDb(ArrayList<Borrowers>list) {
	Connection cn= Connect.getConnection();
	try {
		int op=0;
		PreparedStatement pst=cn.prepareStatement("insert into borrower(id,name)values(?,?); ");
	for(Borrowers bk:list) {
		int id = bk.getId();
		String name=bk.getName();
		pst.setInt(1, id);
		pst.setString(2, name);
		int a =pst.executeUpdate();
		op = op+a;
		
	}
	System.out.println("Borrowers added successfully"+op);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void getUpadate() {
	Connection co = Connect.getConnection();
	System.out.println("update borrowers name");
	try {
		PreparedStatement pst=co.prepareStatement("update borrower set name=? where id =?");
	System.out.println("Enter the name for update");
	pst.setString(1, sc.next());
	System.out.println("Enter the id");
	pst.setInt(2, sc.nextInt());
	int a =pst.executeUpdate();
	System.out.println("Borrower name Successfully update"+a);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void getdelete() {
	Connection co = Connect.getConnection();
	System.out.println("Enter the Borrower id from delete");
	int id = sc.nextInt();
	try {
		PreparedStatement pst1=co.prepareStatement("delete from borrower where id =?");
System.out.println("Are you sure to delete id:"+id);
System.out.println("press 1 for the delete\n press 2 for the cancelled");
int sure=sc.nextInt();
if(sure==1) {
pst1.setInt(1, id);
int a=pst1.executeUpdate();
System.out.println("deleted:"+a);
}else {
	System.out.println("cancelled");
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void display() {
	Connection co = Connect.getConnection();
	try {
		Statement st =co.createStatement();
	ResultSet rs =st.executeQuery("select * from borrower");
	while(rs.next()) {
		int id =rs.getInt("id");
		String name=rs.getString("name");

		
		
		System.out.println("Id"+id+"\name :"+name);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
