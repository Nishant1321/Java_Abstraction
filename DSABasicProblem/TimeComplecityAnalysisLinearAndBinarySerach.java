package DSABasicProblem;

public class TimeComplecityAnalysisLinearAndBinarySerach {
public static int binerySearch(int[] a, int key) {
	
int start =0;
int end=a.length-1;
while(start<=end) {
	int mid=(start+end)/2;
	if(a[mid]==key) {
		return mid;
	}else if(a[mid]<key) {
		start=mid+1;
	}else {
		end=mid-1;
	}
}
return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linear Search
//int x[]= {2,3,4,5,6};
//int y=4;
//for(int i=0;i<x.length;i++) {
//if(x[i]==y) {
//	System.out.println("number is "+y);
//	break;
//}
//}
//binary search

		int a[]= {5,4,3,2,1,78,12,23,45};
		int key=12;
		int result=binerySearch(a,key);
		if(result!=-1) {
			System.out.println("the Number index is :"+result);
		}else {
			System.out.println("Number is not found");
		}
	}
}
	