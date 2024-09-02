package ArrayProblem;

public class nonEmpty {

	
public 	static int empty (int array[],int n) {
	
	if(n==0||n==1) {
		return n;
	}
		int temp[]=new int[n];
		int j=0;
		
		for(int i =0;i<n-1;i++) {
		if(array[i]!=array[i+1] ) {
		temp[j++]=array[i];
		}
		}
     temp[j++]=array[n-1];

		for(int i=0;i<j;i++) {
			array[j]=temp[i];
			
		
		}
		
		
		return j;
		
}
public static void main(String args[]) {
	int array[]= {0,1,2,2,3};
	int n=array.length;
n=	empty(array,n);

for(int i=0;i<n;i++) {
	System.out.println(array[i]);
}
}
}

