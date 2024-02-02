package com.Incapsulation;
import java.util.*;
public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//App obj=new App();
Scanner sc = new Scanner(System.in);
while(true) {
System.out.println("Enter the choice \n press 1 for the setdata\n press 2 for the getData");
//int ch =sc.nextInt();

switch(sc.nextInt()) {
case 1:
	App.setData();
	break;
case 2:
	App.getData();
	break;
	default:
		System.out.println("Invalid Number");
}
}

	}

}
