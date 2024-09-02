package ArrayProblem;
import java.util.*;
public class AssendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the length of the array");
int size=sc.nextInt();
int j=1;
int n[]=new int[size];
for(int i=0;i<size;i++) {
	n[i]=sc.nextInt();
	
}
boolean isAssending = false;
for(int i=0;i<size-1;i++) {
	if(n[i]>n[i+1]) {
		isAssending=true;

	}
	
		
	}
if(isAssending) {
	System.out.println("IS assending");
}else {
	System.out.println("is not assending");
}
	}

}
