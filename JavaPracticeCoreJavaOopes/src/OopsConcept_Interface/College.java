package OopsConcept_Interface;

import java.util.Scanner;

public interface College  extends Sport{

	public String collegeName();
	public String departMentName();
	public String className();
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice:\n press 1 for : College\n press 2 for : Sport");
		switch(sc.nextInt()) {
		case 1:
			Operations.getCollege();
			break;
		case 2:
			Operations.getSport();
			break;
			default:
				System.out.println("Enter the valid number");
		}
	}
}
