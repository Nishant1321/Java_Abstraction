package ArrayProblem;
import java.util.*;;
public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of Array");
int n = sc.nextInt();
int a[]= new int[n];
int largest=0;
System.out.println("Enter the Array of A :");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++) {
for(int j=0;j<n-i-1;j++) {
	if(a[j]<a[j+1]) {
		int temp= a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
		
	}
	
}
System.out.println("largest array is : ");
for(int num :a) {
	
	System.out.println( num+ " ");	
}


	}

}
