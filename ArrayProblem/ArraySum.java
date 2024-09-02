package ArrayProblem;

public class ArraySum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int target=10;
int a[]= {2,3,1,5,7};
for(int i =0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
	sum=a[i]+a[j];
	if(sum==target) {
		System.out.println("fisrt index :" +i+" second index : "+ j);
	}
	}
}

}

}
