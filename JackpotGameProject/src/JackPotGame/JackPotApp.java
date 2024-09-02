package JackPotGame;

import java.util.Random;
import java.util.Scanner;

public class JackPotApp {
//	static UserOp su= new UserOp();
	static JackpotInfo obj = new JackpotInfo();
//	static User jk=new User();
	static Scanner sc = new Scanner(System.in);
	public static  void setData() {
		
	
		System.out.println("Add the Fund more than 250 points ");
		int amount =sc.nextInt();
		obj.setAmount(amount-150);
		
		if(amount<150) {
			System.out.println("Enter more than 150");
			
		}else {
			
//			while(true) {
		
			System.out.println("Wel-come to jackPot Game");
			
		//	amount=obj.getAmount()-150;
//			obj.setAmount(amount-150);
			Random rm=new Random();
			int i =rm.nextInt(1,10);
			System.out.println(i);
			
			System.out.println("plse enter your number");
			int c =sc.nextInt();
			if(c==i) {
				System.out.println("Winner");
				//amount=obj.getAmount()+250;
				obj.setAmount(amount+150);
//				break;
			}
			else {
				System.out.println("Looser");
//				obj.getAmount();
				obj.setAmount(amount-150);
				}
		
		
				}
		
		}
		
//	}		
		


	public static void getData() {
		
		
		System.out.println("It is Your Amount is :"+obj.getAmount());
//System.out.println("the Usre Name is :"+su.display(us));
	}



		
				
			
		

		
	}




