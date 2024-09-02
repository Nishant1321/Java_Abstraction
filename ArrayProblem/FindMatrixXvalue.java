package ArrayProblem;
import java.util.*;
public class FindMatrixXvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the col");
		int col=sc.nextInt();
		System.out.println("Eneter the X value");
		int x=sc.nextInt();
		int a[][]= new int[row][col];
		System.out.println("Enetr the Array A");
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("the Index is :");
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==x) {
				System.out.println(i+" "+j);
				
			}
			}
		}
		
		
	}

}
