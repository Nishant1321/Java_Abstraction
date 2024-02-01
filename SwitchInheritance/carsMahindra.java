package SwitchInheritance;
import java.util.*;
public class carsMahindra extends car{
	public static void getMahindra() {
		Scanner sc =new Scanner(System.in);
	System.out.println("Choose car : press 1 for altroz\n press 2 for safari");
	int ch =sc.nextInt();
	switch(ch) {
	case 1 :
		Mahindra.getAltroz();
		break;
	case 2 :
		Mahindra.getSafari();
		break;
		default:
			System.out.println("invalid syntax");
		
		
	}
	

		
	}

}
