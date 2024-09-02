package DSABasicProblem;
import java.util.*;
public class RatFindHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of aray :");
int n = sc.nextInt();
System.out.println("Enter the Rat :");
int rat=sc.nextInt();
System.out.println("Enter the unit :");
int unit=sc.nextInt();
int result =rat*unit;
int count =0;
int output=0;
int a[]=new int[n];
System.out.println("Enter the Array Value :");
for(int i = 0;i<n;i++) {

	a[i]=sc.nextInt();
}

for(int i = 0;i<n;i++) {
	count += a[i];
	if(count>=result) {
		output=i+1;
		break;
		
	}
	
}
System.out.println(output);


	}

}
