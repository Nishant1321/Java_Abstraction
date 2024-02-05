package testQ3Car;
import java.util.*;
public abstract class bike extends Car {
	public static void getBike() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the choice :\n press 1 for the PULSERE\npress 2 for the KTM");
	switch (sc.nextInt()) {
	case 1 :
		System.out.println("welcome to bike pulser");
	Pulsere obj = new Pulsere();
	obj.Model();
	obj.Year();
		break;
	case 2 :
		System.out.println("welcome to bike Ktm");
		Ktm obj1 = new Ktm();
		obj1.Model();
		obj1.Year();
		break;
		
	}

}
}