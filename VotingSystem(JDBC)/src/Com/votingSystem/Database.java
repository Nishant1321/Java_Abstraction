package Com.votingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import Com.voting.candidate.Candidate;
import java.util.*;
public class Database {
	static Scanner sc= new Scanner(System.in);
public static void saveToDb(ArrayList<Candidate>list) {
	Connection cn =Connect.getConnect(); 
	
	try {
		int op=0;
		PreparedStatement st=cn.prepareStatement("insert into candidate(name,age,party)values(?,?,?);");
	for(Candidate cd:list) {
		String name=cd.getName();
		
		int age=cd.getAge();
		
		String party=cd.getParty();
		st.setString(1, name);
		st.setInt(2, age);
		st.setString(3, party);
	int ch=	st.executeUpdate();
	op =op+ch ;
		
	}
	System.out.println(op+"Candidate Added Successufully");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
}
public static void getUpdate() {
	
	Connection co=Connect.getConnect();
	
	try {
	System.out.println("Enter the choice : \n press 1 for the update name \n press 2 for the update the party\n press 3 for the update the age");
	
	switch(sc.nextInt()) {
	case 1:
		PreparedStatement st=co.prepareStatement("update candidate set name=? where id =?;");
	System.out.println("Enter the update name :");
	st.setString(1, sc.next());
	System.out.println("Enter the id :");
	st.setInt(2, sc.nextInt());
	int na=st.executeUpdate();
	System.out.println(na+" name update Successfully");
	break;
	case 2:
		PreparedStatement st1=co.prepareStatement("update candidate set party=? where id=?;");
	System.out.println("Enter the party for update :");
	st1.setString(1, sc.next());
	System.out.println("Enter the id :");
	st1.setInt(2, sc.nextInt());
	int pa=st1.executeUpdate();
	System.out.println(pa+" party update succesfully");
	break;
	case 3:
		PreparedStatement st2=co.prepareStatement("update candidate set age=? where id=?;");
		System.out.println("Enter the age for update :");
		
		st2.setInt(1, sc.nextInt());
		System.out.println("Enter the id :");
		st2.setInt(2, sc.nextInt());
		int ag=st2.executeUpdate();
		System.out.println(ag+" age update succesfully");
		break;
		
	}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
	
}
public static void getDelete() {
	Connection co=Connect.getConnect();
	
	try {
	System.out.println("Enter the candidate id for delete");
	int id = sc.nextInt();
	
		
		PreparedStatement st =co.prepareStatement("delete from candidate where id=?");
		
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
	ResultSet rs =st.executeQuery("select * from candidate");
	while(rs.next()) {
		int id =rs.getInt("id");
		String name=rs.getString("name");
		int age = rs.getInt("age");
		String party=rs.getString("party");
		int votes =rs.getInt("votes");
		System.out.println("Id"+id+"\nname :"+name+"\nvotes :"+votes+"\nparty :"+party+"\n age:"+age);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}

