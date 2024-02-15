package JackPotGame;

import java.util.Scanner;

public class JackPotResult {
	
		
	public static void getJackPotInfo() {

		Scanner sc=new Scanner(System.in);
	boolean b=true;
		while(b) {
		System.out.println("Enter the choice : \n press 1 for Start the game \n press 2  for the check the balance\npress 3 for the logOut");
		// TODO Auto-generated method stub
		switch(sc.nextInt()) {
		case 1:
			JackPotApp.setData();
			System.out.println(" ");
			
			break;
			
		case 2:
			JackPotApp.getData();
			System.out.println(" ");
			
			break;
		case 3:
			b=false;
			Test.Start();
			break;
		
	
		
			
		}


		


	}

	}
}

