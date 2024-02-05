package testQ3Car;
import java.util.*;
public class Operation {
 static Scanner sc = new Scanner(System.in);
public static void getTataCar() {
	System.out.println("Enter the choice :\n press 1 for the swift\n press 2 for the safari");
	switch(sc.nextInt()) {
	case 1:
		System.out.println("Welcome to Tata Swift");
		Swift obj = new Swift();
		
		obj.Model();
		obj.Year();
		break;
	case 2:
		System.out.println("Welcome to Tata Safari");
		Safari obj1=new Safari();
		obj1.Model();
		obj1.Year();
		break;
	}
}
public static void getToyataCar() {
	System.out.println("Enter the choice :\n press 1 for the Fortuner\n press 2 for the Supra");
	switch(sc.nextInt()) {
	case 1:
		System.out.println("Welcome to Toyata Fortuner");
		Fortuner obj = new Fortuner();
		obj.Model();
		obj.Year();
		break;
		
	case 2:
		System.out.println("Welcome to Toyata SUpra");
		Supra obj1=new Supra();
		obj1.Model();
		obj1.Year();
		
		break;
	}
}

}
