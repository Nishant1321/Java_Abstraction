package DSAProblemStatement;
import java.util.*;
public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the diamnetionals :");
System.out.println("By row");
int row=sc.nextInt();
System.out.println("By col");
int col=sc.nextInt();

int a[][]= new int[row][col];
int b[][]=new int[row][col];
int c[][]=new int[row][col];
System.out.println("Enter the A matrix :");
for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		a[i][j]=sc.nextInt();
	}
}
System.out.println("Enter the b matrix :");
for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		b[i][j]=sc.nextInt();
	}
}
for(int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.println("the answer is :"+c[i][j]);
	}
}
}

}
