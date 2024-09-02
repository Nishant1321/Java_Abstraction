package Car;
import java.util.*;
public  class CarOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice : press 1 for the ms\n press 2 for tata\n press 3 for Toyata");
		int ch= sc.nextInt();
		switch(ch) {
		case 1:
		// TODO Auto-generated method stub
System.out.println("Welcome to ms");
Ms.getMsDilers2();
break;
		case 2:
			System.out.println("Welcome to tata");
Tata.gettataDilers();
		
break;
		case 3:
			System.out.println("Welcome to toyato");
			Toyato.gettoyataDilers();
break;
default:
	System.out.println("invalid Choice");
	}
	}
	

}
