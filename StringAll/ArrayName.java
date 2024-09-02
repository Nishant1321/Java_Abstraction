package StringAll;
import java.util.*;
public class ArrayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Array Size: ");
int n= sc.nextInt();

String[] name=new String[n];
System.out.println("Enter the name :");
for(int i =0;i<name.length;i++) {
	
	name[i]=sc.next();
	
}
for(int i =0;i<name.length;i++) {
	System.out.println(name[i]);
	
}
	}

}
