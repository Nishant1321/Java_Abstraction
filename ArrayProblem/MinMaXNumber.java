package ArrayProblem;
import java.util.*;
public class MinMaXNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int size =sc.nextInt();

int number[]=new int[size];
for(int i=0;i<size;i++) {
	number[i]=sc.nextInt();
	
}
for(int i=0;i<size;i++) {
System.out.println( Math.max(size, number[i]));
System.out.println( Math.min(size, number[i]));
break;
	}
}
	}


