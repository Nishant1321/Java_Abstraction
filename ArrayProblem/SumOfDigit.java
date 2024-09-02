package ArrayProblem;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in); 

System.out.println("enter the number odr sum :");
int n=sc.nextInt();
int temp=n;
int sum=0;
while(temp>0) {
	int lastDigit=temp%10;
	temp /=10;
	sum+=lastDigit;
System.out.println(lastDigit+" "+temp+" "+sum);
	
	
}
System.out.println(sum);
	}

}
