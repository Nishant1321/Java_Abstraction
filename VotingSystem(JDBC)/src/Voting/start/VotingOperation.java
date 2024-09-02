package Voting.start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Com.votingSystem.Connect;

public class VotingOperation {
	static Scanner sc = new Scanner(System.in);
	
public void setId() {
	Connection co = Connect.getConnect();
	
	try {
		int totalCandidate=0;
		Statement st =co.createStatement();
	ResultSet pst=st.executeQuery("select id from candidate;");
	PreparedStatement pt=co.prepareStatement("insert into voting(id) values( ?);");
	while(pst.next()) {
	int ids=pst.getInt("id");
	pt.setInt(1, ids);
	totalCandidate=pt.executeUpdate();
	totalCandidate=totalCandidate+1;
}
System.out.println(totalCandidate+" candidate add successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public void StartVoting() {
	Connection co =Connect.getConnect();
	System.out.println("Enter the id :");
	int Voterid=sc.nextInt();
	
	try {
		Statement st1 =co.createStatement();
	ResultSet pst=st1.executeQuery("select id from voters;");
	boolean found =false;
	while(pst.next()) {
	int ids=	pst.getInt("id");
	

	
	while(Voterid==ids) {
	Statement trashst=co.createStatement();
	ResultSet restrash=trashst.executeQuery("select * from trash;");
	
	boolean check=false;
	while(restrash.next()) {
		int existingId=restrash.getInt("id");
		if(existingId==Voterid) {
			System.out.println("already voting");
		check=true;
			break;
		}
		
		
		
	}
	if(check==false) {
	PreparedStatement pstrash=co.prepareStatement("insert into trash (id) values(?);");
	pstrash.setInt(1, Voterid);
	pstrash.executeUpdate();
	VotingOperation.setVotes();
	System.out.println("Successfully");
	}
		
	found=true;
	break;	
		
		
	
	}

	}
	if(!found) {
		System.out.println("Invalid voters");
	}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
 public static void setVotes() {
	 VotingOperation.finalCandiddate();
	System.out.println("choose the candidate");
	int id = sc.nextInt();
	Connection co =Connect.getConnect();
	try {
		PreparedStatement st=co.prepareStatement("select votes from voting where id  =?");
	st.setInt(1, id);
ResultSet rst=st.executeQuery();
while(rst.next()) {
	int   singleVotes=rst.getInt("votes");
	singleVotes=singleVotes+1;
	
	//send increase votes back to the table
	PreparedStatement  voting=co.prepareStatement("update voting set votes=? where id=?");
	voting.setInt(1,singleVotes);
	voting.setInt(2, id);
	int n=voting.executeUpdate();
	System.out.println(singleVotes+" Susccessfully :"+n);
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void finalCandiddate() {
	Connection co = Connect.getConnect();
	try {
		Statement st =co.createStatement();
	ResultSet rst=st.executeQuery("select * from candidate");
	while(rst.next()) {
		int id =rst.getInt("id");
		String name =rst.getString("name");
		int age =rst.getInt("age");
		String party=rst.getString("party");
		System.out.println("id:"+id+"\tname:"+name+"\tage:"+age+"\tparty:"+party);
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
