package ArrayProblem;

public class MInMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int n=a.length;
for(int i = 0;i<n;i++) {
	
	int res=Math.min(a[i], n);
	int result=Math.max(a[i], n);
	System.out.println("Enter the min "+ res+" max :"+ result);
}


	}

}
