package SwitchInheritance;
import java.util.*;
public class carsTata extends car{
	public static void getTata() {
		Scanner sc =new Scanner(System.in);
	System.out.println("Choose car : press 1 for altroz\n press 2 for safari");
	int ch =sc.nextInt();
	switch(ch) {
	case 1 :
		Tata.getAltroz();
		break;
	case 2 :
		Tata.getSafari();
		break;
		default:
			System.out.println("invalid syntax");
		
		
	}
	

		
	}

}
