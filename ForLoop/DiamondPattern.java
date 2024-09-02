package ForLoop;
import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n= sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++) {
	
	System.out.print("*");
	
	}
	
	System.out.println();
	}
for(int j=n;j>=1;j--) {
	for(int k =1;k<=n-j;k++) {
		System.out.print(" ");
	}
	for(int k=1;k<=2*j-1;k++) {
		System.out.print("*");
	}
	System.out.println();
}
	
}
	}


