package DSAProblemStatement;
import java.util.*;
import java.math.*;
public class LongFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n= sc.nextInt();
BigInteger fact=BigInteger.ONE;
for(int i = 1;i<=n;i++) {
	fact=fact.multiply(BigInteger.valueOf(i));
	
}
System.out.println("the long Factorial is :"+fact);
}

}
