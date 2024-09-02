package ArrayProblem;
import java.util.*;
public class ReverceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Array length :");
int n = sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the Array length");
for(int i =0;i<n;i++) {
	a[i]=sc.nextInt();
}
for(int i=n-1;i>=0;i--) {
	System.out.println(a[i]);
}
	}

}
