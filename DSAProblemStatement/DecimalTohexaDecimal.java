package DSAProblemStatement;
import java.util.*;
public class DecimalTohexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("decimal to hexadecimal");
System.out.println("Enter the number for decimal");
int decimal=sc.nextInt();
String hexadecimal=Integer.toHexString(decimal);
System.out.println("The hexaDecimal : "+hexadecimal);

//System.out.println("Hexadecimal to decimal");
//System.out.println("Enter the HexaDecimal :");
//String hexaD=sc.nextLine();
//int deciNo=Integer.parseInt(hexaD, 16);
//System.out.println("the decimal Number is :"+deciNo);



	}

}
