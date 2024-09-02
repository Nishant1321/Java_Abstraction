package DSAProblemStatement;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number : ");
int n= sc.nextInt();
if (n==1 || n==0){
	System.out.println("is not prime");
}else {
boolean isPrime=false;
for(int i=2;i<=n/2;i++) {
	if(n%i==0) {
		isPrime=true;
		
		break;
	}
	
	
}

if(!isPrime) {
	System.out.println("is prime :"+ n);
}else{
	System.out.println("is not Prime :"+ n);
}

}
	}

}
