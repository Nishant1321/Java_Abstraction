package efElse;
import java.util.*;
public class GraterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
//int c =sc.nextInt();
//if(a>b && a>c) {
//	System.out.println(a);
//}else if(b>a && b>c) {
//	System.out.println(b);
//}else {
//	System.out.println(c);
//}
//System.out.println("Enter the marks");
//int n = sc.nextInt();
//if(n>=75) {
//System.out.println("Distinction");
//
//	}
//	else if(n<75 && n>=60) {
//		System.out.println("first class");	
//	}else if(n>35 && n<60) {
//		System.out.println("second class");
//		
//	}else {
//		System.out.println("fail");
//	}
System.out.println(Math.max(a, b));
}
}