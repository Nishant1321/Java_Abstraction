package SwitchInheritance;
import java.util.*;
public class carsBmw extends car{
	public static void getBmw() {
		Scanner sc =new Scanner(System.in);
	System.out.println("Choose car : press 1 for x5\n press 2 for x6");
	int ch =sc.nextInt();
	switch(ch) {
	case 1 :
		Bmw.getx5();
		break;
	case 2 :
		Bmw.getx6();
		break;
		default:
			System.out.println("invalid syntax");
		
		
	}
	

		
	}

}
