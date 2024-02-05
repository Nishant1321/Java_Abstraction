package testQ4Calculator;
import java.util.*;
public class Calculator {
	static Scanner sc =new Scanner(System.in);
	// For the Addition
public static void  Addition(int a, int b) {
	
	System.out.println("the two  Number Addition is :"+(a+b));
	}
public static void  Addition(int a, int b,int c) {
	
	System.out.println("the three  Number Addition is :"+(a+b+c));
	}
//for the Substraction;
public static void  Substraction(int a, int b) {
	
	System.out.println("the two Number  Substraction is :"+(a-b));
	}
public static void  Substraction(int a, int b,int c) {
	
	System.out.println("the three Number Number Substraction is :"+(a-b-c));
	}
// for the Multiplication
public static void  Multiplication(int a, int b) {
	
	System.out.println("the two Number  Multiplication"+(a*b));
	}
public static void  Multiplication(int a, int b,int c) {
	
	System.out.println("the three Number  Multiplication is :"+(a*b*c));
	}
// for the Division
public static void  Division(int a, int b) {
	
	System.out.println("the two Number  Division is"+(a/b));
	}
public static void  Division(int a, int b,int c) {
	
	System.out.println("the three Number  Division is :"+(a/b/c));
	}


	public static void main(String[] args) {
		while(true) {
		System.out.println("the calculator :\n press 1 for the Additin\n press 2 for the Substraction \n press 3 for the Multiplication\nPress 4 for the Division");
		// TODO Auto-generated method stub
		switch(sc.nextInt()) {
		case 1:
			System.out.println("for the Addition");
		System.out.println("Enter the addition for two Number");
		Calculator.Addition(sc.nextInt(),sc.nextInt());
		System.out.println("Enter the addition for three Number");
		Calculator.Addition(sc.nextInt(),sc.nextInt(),sc.nextInt());
		break;
		case 2:
			System.out.println("for the Substraction");
			System.out.println("Enter the Substrsction for two Number");
			Calculator.Substraction(sc.nextInt(),sc.nextInt());
			System.out.println("Enter the Substraction for three Number");
			Calculator.Substraction(sc.nextInt(),sc.nextInt(),sc.nextInt());
			
			break;
		case 3:
			System.out.println("for the ");
			System.out.println("Enter the Multiplication for two Number");
			Calculator.Multiplication(sc.nextInt(),sc.nextInt());
			System.out.println("Enter the Multiplication for three Number");
			Calculator.Multiplication(sc.nextInt(),sc.nextInt(),sc.nextInt());
			break;
		case 4:
			System.out.println("for the ");
			System.out.println("Enter the Division for two Number");
			Calculator.Division(sc.nextInt(),sc.nextInt());
			System.out.println("Enter the Division for three Number");
			Calculator.Division(sc.nextInt(),sc.nextInt(),sc.nextInt());
			break;
			default:
				System.out.println("choose the correct Number");
	}
	}
}
}
