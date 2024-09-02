package DSABasicProblem;

import java.util.Stack;
import java.util.*;
public class StackImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n= sc.nextInt();
		int a[]= new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	
	System.out.println(a[i]);
}

st.push(10);
st.push(15);
System.out.println(st);

	}

}
