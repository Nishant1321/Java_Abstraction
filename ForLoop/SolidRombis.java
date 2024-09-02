package ForLoop;
import java.util.*;
public class SolidRombis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of Star");
int n =sc.nextInt();
System.out.println("Enter the number of space");
int space=sc.nextInt();
for(int i=1;i<=space;i++) {
	for(int j=1;j<=space-i+1;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=n;j++) {
		
		System.out.print("*");
	}
	System.out.println();
}


	}

}
