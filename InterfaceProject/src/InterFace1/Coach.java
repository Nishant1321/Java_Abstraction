package InterFace1;

import InterFace2.Diet;
import InterFace2.Diet1;

import java.util.*;
public   interface Coach extends Diet{
	String getDailyWorkout();
	String getPractice();
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the choice : \n press 1 for the Coaching\npress 2 for the Diet");
	switch(sc.nextInt()) {
	case 1 :
		Coach1.getCoachMethod();
		break;
	case 2 :
		Diet1.getDietMethod();
		break;
		default:
			System.out.println("Enter the invalid Number");
		
	}
}
}
