package DSABasicProblem;
import java.util.*;;
public class SumAvgMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int avg=0;
int sum=0;
System.out.println("Enter the size of array");
int n= sc.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++) {
	 sum += a[i];
	
}
System.out.println("Sum is :"+sum);
for(int i=0;i<n;i++) {
System.out.println("Maximum size is : "+ Math.max( a[i],n));
System.out.println( "Minimum size is : "+ Math.min( a[i],n));
break;
}
for(int i=0;i<n;i++) {
	
	avg=sum/n;
}

System.out.println("average is : "+avg);

	}
	

}
