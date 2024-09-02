package ArrayProblem;
import java.util.*;
public class MtrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the row");
int row=sc.nextInt();
System.out.println("eneter the coloumn");
int col =sc.nextInt();
int a[][]=new int[row][col];
int b[][]= new int[row][col];
int c[][]=new int[row][col];
System.out.println("Enter the first A");
for(int i=0;i<row;i++) {	
	for(int j=0;j<col;j++) {
		a[i][j]=sc.nextInt();
	}
	
}
System.out.println("Enter the first B");
for(int i=0;i<row;i++) {	
	for(int j=0;j<col;j++) {
		b[i][j]=sc.nextInt();
	}
	}
System.out.println("Enter the first c");
for(int i=0;i<row;i++) {	
	for(int j=0;j<col;j++) {
		 c[i][j]=a[i][j]+b[i][j];
		 System.out.println(c[i][j]);
	}

}
}
}