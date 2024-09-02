package DSABasicProblem;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {9,8,7,5,1};
int n=a.length;
for(int i=0;i<n-1;i++) {
	boolean found= true;
	for(int j=0;j<n-i-1;j++) {
		if(a[j+1]<a[j]) {
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			found=false;
		}
	}
	if(found) break;
}
System.out.println("sorted array: ");
for(int item :a) {
	System.out.print(" "+ item);
}
	}

}
