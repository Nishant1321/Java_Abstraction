package ForLoop;
import java.util.*;
public class ButterFlyPattern {

	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		
		int space=2*(n-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
	
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}
		int space=2*(n-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
		
	}
}

