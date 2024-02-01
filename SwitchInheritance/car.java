package SwitchInheritance;
import java.util.*;
public class car {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your fav car : press 1 for tata\n press 2 for bmw\n press 3 for mahindra");
		int ch=sc.nextInt();
		switch(ch) {
		case 1 :
			System.out.println("Welcome to tata");
			carsTata obj =new carsTata();
			obj.getTata();
			break;
		case 2 :
			System.out.println("Welcome to BMW");
			carsBmw obj1 =new carsBmw();
			obj1.getBmw();
			break;
		case 3 :
			System.out.println("Welcome to Mahindra");
			carsMahindra obj3 =new carsMahindra();
			obj3.getMahindra();
			
			
			break;
			default:
				System.out.println("invalid car");
		}
		
	}

}
