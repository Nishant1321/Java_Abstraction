package operators;
import java.util.Scanner;
public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
boolean f= a>b;
System.out.println(f);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
//bitwise operators
System.out.println(false &true);
System.out.println(true&true);

System.out.println(false && true);
System.out.println(false|true);
System.out.println(true||false);
//ternary operator
String d=(a>b)? "a is greater than b":"b is greater than a";
System.out.println(d);
String e=(a>b)? "print first part":"print second part";
System.out.println(e);


	}

}
