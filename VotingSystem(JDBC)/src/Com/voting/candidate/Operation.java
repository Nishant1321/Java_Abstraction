package Com.voting.candidate;

import java.sql.SQLException;
import java.util.*;

import Com.votingSystem.CandidateTest;
import Com.votingSystem.Database;

public class Operation {
	static CandidateTest ct = new CandidateTest();
	static Database db= new Database();
	static MultCandidate md=new MultCandidate();
	static Candidate cd= new Candidate();
static Scanner sc = new Scanner(System.in);
public static void  setCandidate() {
	int ch=1;
	while( ch==1) {
		Candidate cd= new Candidate();
	
		System.out.println("Enter the name");
		cd.setName(sc.next());
		
		System.out.println("Enter the party");
		cd.setParty(sc.next());
		
		System.out.println("Enter the age");
		cd.setAge(sc.nextInt());
		md.addCandidate(cd);
		
		System.out.println("Press 1 for the add more candidate \n press 2 for the save candidate ");
		 ch = sc.nextInt();
		 try {
		 if (ch==2) {
			md.save();
		}
		 }catch(Exception e) {
			 System.out.println("Enter the valid age :");
			 cd.setAge(sc.nextInt());
			 
		 }
	}
}

public void CandidateOperation(){
	boolean b=true;
	while(b) {
	System.out.println("Enter the choice:\n press 1 for the registration\n press 2 for the update\npress 3 for the delete\npress 4 for the display");
switch(sc.nextInt()) {
case 1:
Operation.setCandidate();
	break;
case 2:
	Database.getUpdate();
	break;
case 3:
	Database.getDelete();
	break;
case 4:
	Database.display();
	
	break;

	
	}
}

}

}
