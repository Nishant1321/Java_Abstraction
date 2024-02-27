package Test2;
import java.util.*;
public class Number {
	
	static Scanner sc= new Scanner(System.in); 
	
	public static  void division(int a ,int b) throws CustomeExceptionDemo{
		try {
		int c= a/b;
		if(c<=0) {
			throw new CustomeExceptionDemo("Invalid Exception");
		}
		else {
			System.out.println(c);
		}
		
	}catch(RuntimeException e) {
					System.out.println("Invalid Exception");	
					}
			}
public static void main(String args[]) {
Number obj1=new Number();
		System.out.println("Enter the two number");
		obj1.division(sc.nextInt(),sc.nextInt());
}
}
