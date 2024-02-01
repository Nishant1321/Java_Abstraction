package switchOperation;
import java.util.*;
public class Calculator {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the First Number");
int a = sc.nextInt();
System.out.println("Enter the Second Number");
int b =sc.nextInt();
System.out.println("Choose the Operation");
String calculator =sc.next();
switch(calculator){
case "Addition":
	System.out.println(a+b+"the addition is ");
	break;
case "Substraction":
	System.out.println(a-b+"the Substarction is ");
	break;
case "Multiplication":
	System.out.println(a*b+"the multiplication is ");
	break;
case "Division":
	System.out.println(a/b+"the division is ");
	break;
case "module":
	System.out.println(a%b+"the division is ");
	break;
default:
	System.out.println("the invalid value is ");
	break;
	
}
	}

}
