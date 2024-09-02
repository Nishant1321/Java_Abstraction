package ArrayProblem;
import java.util.*;
public class BobAlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length a : ");
int n =sc.nextInt();
System.out.println("Enter the length b : ");
int m=sc.nextInt();
int a[]= new int[n];
int b[]= new int[m];
int alice =0;
int bob=0;

System.out.println("Enter the element a : ");
for(int i = 0; i<n;i++) {
	a[i]=sc.nextInt();
	
}
System.out.println("Enter the element b : ");
for(int i = 0; i<m;i++) {
	a[i]=sc.nextInt();
	
}
//for(int i = 0; i<n;i++) {
//	System.out.println(a[i]);
//	
//}
//for(int i = 0; i<m;i++) {
//	System.out.println(a[i]);
//	
//}
for(int i=0;i<n;i++) {
	for(int j =0;j<m;j++) {
		if(a[0]>b[0]) {
			alice++;
		}else if(a[1]>b[1]) {
			alice++;
		}else if(a[2]>b[2]) {
			alice++;
		}else if(a[i]==b[i]) {
			alice +=0;
			bob +=0;
		}else if(b[0]>a[0]) {
			bob++;
			
		}else if(b[1]>a[1]) {
			bob++;
			
		}else if(b[2]>a[2]){
			bob++;
		}
		
	}
}
System.out.println(" the alice point : " +alice+" the bob point :" + bob);
	}

}
