package ArrayProblem;
import java.util.*;
public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter the length");

int x=2;
int size=sc.nextInt();
int n[]=new int[size];
for(int i=0;i<size;i++) {
n[i]=sc.nextInt();
}
for(int i=0;i<size;i++) {
	if(n[i]==x) {
	System.out.println(n[i]);
}
}
	}

}
