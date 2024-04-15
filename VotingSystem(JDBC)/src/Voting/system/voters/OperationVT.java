package Voting.system.voters;
import java.util.*;

import Com.votingSystem.Database;
public class OperationVT {
	static MultVoters mt=new MultVoters();
static Scanner sc= new Scanner(System.in);
public static void setVoters() {
	
	int ch=1;
	while(ch==1) {
	Voters vt = new Voters() ;
	System.out.println("Enter the name");
	vt.setName(sc.next());
	System.out.println("Enter the age ");
	vt.setAge(sc.nextInt());
	System.out.println("Enter the gender");
	vt.setGender(sc.next());
	System.out.println("Enter the area");
	vt.setArea(sc.next());
	mt.addvoters(vt);
	System.out.println("press 1 for the add more voters\n press 2 for the save voters");
	ch=sc.nextInt();
	if(ch==2) {
		mt.save();
		
	}
	}
}
public void VotersOperation() {
	
		
	System.out.println("Enter the choice:\n press 1 for the registration\n press 2 for the update\npress 3 for the delete\npress 4 for the display");
	switch(sc.nextInt()) {
	case 1:
	OperationVT.setVoters();;
		break;
	case 2:
		DataBase.getupdate();
		break;
	case 3:
		DataBase.getDelete();
		break;
	case 4:
		DataBase.display();
		
		break;
	
	}
	}
	
}

