package ForLoop;

import java.util.Scanner;

public class ContinueNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number for print a star");
int n=sc.nextInt();
int a=1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(a+" ");
		a++;
	}
	
	System.out.println();
	
}

		
		
		
	}
}
