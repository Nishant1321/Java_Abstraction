package Borrower;

import java.util.Scanner;

public class BarrowerOperation {
static	DatabaseBarrower db=new DatabaseBarrower();
	static Scanner sc = new Scanner(System.in);
	static MultyBorrower mb= new MultyBorrower();
public static void createBorrower() {
	int ch = 1;
	while(ch==1) {
		Borrowers bv= new Borrowers();
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Borrower id");
	int id =sc.nextInt();
	System.out.println("Enter the Borrower name");
	String name =sc.next();
	bv.setId(id);
	bv.setName(name);
	mb.addBorrower(bv);
	System.out.println("press 1 for add more borrowers \n press 2 for the save borrowers");
	ch=sc.nextInt();
	if(ch==2) {
		mb.save();	
	}
	
	
	
	}
	}
public void BorrowerOperation() {
System.out.println("Enter the choice : \n press 1 for the registration \n press 2 for the update\n press 3  for the delete\n press 4 for the display ");	
switch(sc.nextInt()) {
case 1:
	BarrowerOperation.createBorrower();
	break;
case 2:
	DatabaseBarrower.getUpadate();
	break;
case 3 :
	DatabaseBarrower.getdelete();
	break;
case 4:
	DatabaseBarrower.display();
	break;
}
}

}

