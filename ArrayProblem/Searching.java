package ArrayProblem;
import java.util.*;
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
System.out.println("enter the length");
int n=sc.nextInt();
System.out.println("Enter the key value for findind");
int key=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	if(a[i]==key) {
		System.out.println(key);
	}
	
	
}
	}

}
