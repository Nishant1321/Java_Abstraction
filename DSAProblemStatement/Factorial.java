package DSAProblemStatement;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int result=1;
System.out.println("Enter the number : ");
int n= sc.nextInt();
for(int i=1;i<=n;i++) {
	result *=i;
	System.out.println(i);
}
System.out.println("the factorial is : " +result);
	}

}
