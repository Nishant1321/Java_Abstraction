package testQ5InterFace;

import java.util.Scanner;

public class Rectangular implements shape {

	
	public void calculateArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Lenght");
		int l= sc.nextInt();
		System.out.println(" Enter the Bridth");
		int b=sc.nextInt();
		System.out.println("The area of the Circle is :"+l*b);
		
		
	}
	

}
