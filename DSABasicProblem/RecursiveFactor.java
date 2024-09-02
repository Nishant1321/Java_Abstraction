package DSABasicProblem;
import java.util.*;
public class RecursiveFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int res=1;
System.out.println("Enert the number : ");
int n=sc.nextInt();
for(int i=n;i>0;i--) {
    res *=i;
	
}
System.out.println("the Factorial is : "+res);
	}

}
