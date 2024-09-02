package ArrayProblem;

import java.util.Scanner;

public class ArrayListdivede {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the length of the arrya");
int n = sc.nextInt();
int[] a= new int[n];
System.out.println("Enter the  array value");
for(int i =0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
System.out.println("Enter the out put of the array");
for(int i=0;i<n;i++) {
	 temp=a[i] /2;
	
	
}
System.out.println(temp+" "+a.length);
	}

}
