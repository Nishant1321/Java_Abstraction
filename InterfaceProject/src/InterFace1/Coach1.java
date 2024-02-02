package InterFace1;
import java.util.*;
public abstract class Coach1 implements Coach {
	public static void getCoachMethod() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the coach :\n press 1 for Cricket \n 2 for the Football");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			Cricket obj = new Cricket();
			System.out.println(obj.getPractice());
			System.out.println(obj.getLunch());
			System.out.println(obj.getDailyWorkout());
			//obj.getCoach();
			System.out.println(obj.getBreakFast());
		break;
		case 2:
			Football obj1 = new Football();
			System.out.println(obj1.getPractice());
			System.out.println(obj1.getLunch());
			System.out.println(obj1.getDailyWorkout());
			//obj.getCoach();
			System.out.println(obj1.getBreakFast());
		break;
		default :
			System.out.println("invalid choice");
			
		}
		
	}
	public abstract  void getCoach();

}
