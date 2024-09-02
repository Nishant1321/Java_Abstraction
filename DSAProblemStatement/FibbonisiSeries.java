package DSAProblemStatement;
import java.util.*;
public class FibbonisiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int n = sc.nextInt();
int a =0;
int b=1;
int c=0;
if(n==0) {
	System.out.println(a);
}
for(int i=0;i<=n;i++) {
	System.out.println(a+" ");
c=a+b;
a=b;
b=c;


}

	}

}
