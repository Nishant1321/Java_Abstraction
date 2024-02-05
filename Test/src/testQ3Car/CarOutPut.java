package testQ3Car;
import java.util.*;
public  abstract class CarOutPut {
public static void getCar() {
	
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the choice :\n press 1 for the tata car \n press 2 for the toyata car");
switch(sc.nextInt()) {
case 1 :
	Operation.getTataCar();
	break;
case 2 :
	Operation.getToyataCar();
	break;

	}

}
}