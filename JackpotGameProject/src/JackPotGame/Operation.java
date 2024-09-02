package JackPotGame;
import java.util.*;
public class Operation {
	static Scanner sc = new Scanner(System.in);
static 	UserOp uo=new UserOp();
	public static void getRegistaration() {
		User us = new User();
		System.out.println("Enter the Name");
		String userName=sc.next();
		System.out.println("Enter the Password");
		String pass=sc.next();
		us.setUserName(userName);
		
		us.setPass(pass);
		uo.addUser(us);
		//uo.addUser(us);
		System.out.println("registration Sussesfully");
	Test.Start();
	}
	public static void getLogin() {
		System.out.println("Enter the User Name");
		String userName=sc.next();
		System.out.println("Enter the Password");
		String pass=sc.next();
		System.out.println("check");
		uo.Authentication(userName,pass);
		
}
//	public static void getUserdata() {
//		uo.display();
//	}
		
	}
	


