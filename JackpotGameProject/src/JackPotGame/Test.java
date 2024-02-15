package JackPotGame;
import java.util.*;
public class Test {
	
	static Scanner sc= new Scanner(System.in);
	public static void Start() {
		System.out.println("******************* WELCOME TO HOME *******************");
		System.out.println("Press 1 for RegiStration :\n press 2 for Login");
		switch(sc.nextInt()) {
		case 1 :
			Operation.getRegistaration();
		case 2:
//			Operation.getUserdata();
			Operation.getLogin();
			break;
	
		}
		
		
	}
		
	
	public static void main(String args[]) {
		Test.Start();
	}
}
