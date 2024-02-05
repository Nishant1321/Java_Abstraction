package testQ5InterFace;

import java.util.Scanner;

public interface shape {
	public abstract void  calculateArea();
	 

	public static void main(String args []) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice for find the Area:\n press 1 for the circle\n press 2 for the Rectangular");
		switch(sc.nextInt()) {
		case 1 :
			System.out.println("Area of the Circle is ");
			Circle obj = new Circle();
			obj.calculateArea();
			break;
		case 2 :
			System.out.println("Area of the Rectangular is ");
			Rectangular obj1 = new Rectangular();
			obj1.calculateArea();
			break;
		
		}
	}
}
}