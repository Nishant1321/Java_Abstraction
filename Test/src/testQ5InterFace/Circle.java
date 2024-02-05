package testQ5InterFace;

import java.util.Scanner;

public class Circle implements shape {

	
	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Radius");
		int r= sc.nextInt();
		System.out.println("The area of the Circle is :"+3.14*r *r );
		
		
	}
	

}
