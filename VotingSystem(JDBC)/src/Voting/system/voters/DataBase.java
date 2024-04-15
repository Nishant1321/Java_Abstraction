package Voting.system.voters;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import Com.votingSystem.Connect;

public class DataBase {
	static Scanner sc= new Scanner(System.in);
public static void saveToDb(ArrayList<Voters>list) {
Connection co =ConnectDemo.getConnection();	
try {

	int op=0;
	PreparedStatement st =co.prepareStatement("insert into voters(name,age,gender,area)values(?,?,?,?);");
	
for(Voters ct:list) {
	
	String name=ct.getName();
	st.setString(1, name);
	int age =ct.getAge();
	st.setInt(2, age);
	String gender=ct.getGender();
	st.setString(3, gender);
	String area=ct.getArea();
	st.setString(4, area);
	int ch = st.executeUpdate();

	op=op+ch;
	
	
}
System.out.println(op+"voters added succesfully");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
public static void getupdate() {
Connection co = Connect.getConnect();
try {
System.out.println("Enter the choice: /npress 1 for the update voter name \n press 2 for the update voters age \n press 3 for the update voters gender\n press 4 for the update voters area");
switch(sc.nextInt()) {
case 1:
	
		PreparedStatement st=co.prepareStatement("update voters set name=? where id =?;");
	System.out.println("Enter the name for update :");
	st.setString(1, sc.next());
	System.out.println("Ente the id for update:");
	st.setInt(2, sc.nextInt());
	st.executeUpdate();
	System.out.println("Update Successfully");
	break;
	
	case 2:
		PreparedStatement st1=co.prepareStatement("update voters set age =? where id=?; ");
		System.out.println("Enter the age for the update:");
		st1.setInt(1, sc.nextInt());
		System.out.println("Enter the id for update:");
		st1.setInt(2, sc.nextInt());
		st1.executeUpdate();
		System.out.println("Update Successfully");
	break;
	case 3:
		PreparedStatement st2=co.prepareStatement("update voters set gender =? where id=?; ");
		System.out.println("Enter the gender for the update:");
		st2.setString(1, sc.next());
		System.out.println("Enter the id for update:");
		st2.setInt(2, sc.nextInt());
		st2.executeUpdate();
		System.out.println("Update Successfully");
		break;
	case 4:
		PreparedStatement st3=co.prepareStatement("update voters set area =? where id=?; ");
		System.out.println("Enter the area for the update:");
		st3.setString(1, sc.next());
		System.out.println("Enter the id for update:");
		st3.setInt(2, sc.nextInt());
		st3.executeUpdate();
		System.out.println("Update Successfully");
		break;
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
public static void getDelete() {
	Connection co=Connect.getConnect();
	
	try {
	System.out.println("Enter the voter id for delete");
	int id = sc.nextInt();
	
		
		PreparedStatement st =co.prepareStatement("delete from voters where id=?");
		
	System.out.println("Are you sure to delete id :"+id);
	System.out.println("press 1 for delete \n press 2 for cancel :");
	int sure =sc.nextInt();
	if(sure==1) {
	st.setInt(1, id);
	int na=st.executeUpdate();
	System.out.println("deleted :"+na);
	}else {
		System.out.println("cancelled");	
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	


}
public static void display() {
	Connection co = Connect.getConnect();
	try {
		Statement st =co.createStatement();
	ResultSet rs =st.executeQuery("select * from voters");
	while(rs.next()) {
		int id =rs.getInt("id");
		String name=rs.getString("name");
		int age = rs.getInt("age");
		String gender=rs.getString("gender");
		String area =rs.getString("area");
		System.out.println("Id"+id+"\nname :"+name+"\ngender :"+gender+"\narea :"+area+"\n age:"+age);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
