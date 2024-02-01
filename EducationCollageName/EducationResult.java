package EducationCollageName;
import java.util.*;
public class EducationResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Choice: \npress 1 for the DBATU \npress 2 for Pune");
int ch = sc.nextInt();
switch(ch) {
case 1:
	System.out.println("Welcome to DBATU Univercity");
	Dbatu.getDbatuCollegeInfo();
	break;
case 2:
	System.out.println("Welcome to Pune University");
	Pune.getPuneUnict();
	break;
}
	}

}
