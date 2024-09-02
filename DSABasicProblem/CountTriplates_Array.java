package DSABasicProblem;
import java.util.*;
public class CountTriplates_Array {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);

System.out.println("Enter the Lenghth of Array");
int n= sc.nextInt();
System.out.println("Enter number of Array");
int a[]= new int[n];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	
}
for(int i=0;i<a.length;i++) {
for(int j=0;j<a.length-1;j++) {
	for(int k=0;k<a.length-1;k++) {
		if(a[i]<a[j] && a[j]<a[k]) {
		System.out.println("the number is :"+i+" "+j+" "+k);
	}
}
}
}
	}

}
