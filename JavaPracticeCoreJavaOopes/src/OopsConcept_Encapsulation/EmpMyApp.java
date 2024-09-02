package OopsConcept_Encapsulation;
import java.util.*;
public class EmpMyApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
boolean b;
while(b=true) {
System.out.println("Enter the choice :\n press 1 for : add date\n press 2 for the : get Data\npress 3 for : start resatrtly");
	switch(sc.nextInt()) {
	case 1:
		EmpApp.setData();
		break;
	case 2:
		EmpApp.getData();
		break;
	case 3:
		b=false;
		break;
		default :
			System.out.println("Enter valid number");
	}
	}

}
}
