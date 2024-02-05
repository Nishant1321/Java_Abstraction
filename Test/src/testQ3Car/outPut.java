package testQ3Car;
import java.util.*;
public class outPut {
	public static void main(String args[]) {
		while(true) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the choice:\n press 1 for the car \n press 2 for the Bike");
switch(sc.nextInt()) {
case 1:
	System.out.println("welcome to cars world");
	CarOutPut.getCar();
	break;
case 2:
	System.out.println("welcome to bikes world");
	bike.getBike();
	break;
}
}
}
}