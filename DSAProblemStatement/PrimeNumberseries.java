package DSAProblemStatement;
import java.util.*;
public class PrimeNumberseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
if(n==1) {
	System.out.println("IS no prime number :");
	
}else {
	boolean isprime =false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			isprime= true;
			break;
	}

		
	}
	for(int i =2;i<n;i++) {
		if(n%i==0){
		System.out.println(i+" ");
			
		}
	}
	if(!isprime) {
		System.out.println(" is prime :"+ n);
	}else {
		System.out.println("is not prime :"+n);
	}
}
	}

}
