package InterFace2;
import java.util.*;
public abstract class Diet1 implements Diet {
	public static void getDietMethod() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the coach :\n press 1 for veg \n 2 for the Nonveg");
		int ch = sc.nextInt();
		switch(ch){
		case 1:
			Veg obj = new Veg();
		//	obj.getPractice();
			System.out.println(obj.getLunch());
			//obj.getDailyWorkout();
			//obj.getDiet();
			System.out.println(obj.getBreakFast());
		break;
		case 2:
			NonVeg obj1 = new NonVeg();
			//obj1.getPractice();
		System.out.println(	obj1.getLunch());
			//obj1.getDailyWorkout();
			//obj1.getDiet();
			System.out.println(obj1.getBreakFast());
		break;
		default :
			System.out.println("invalid choice");
			
		}
		
	}
	public abstract  void getDiet();

}
