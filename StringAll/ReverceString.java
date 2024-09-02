package StringAll;
import java.util.*;
public class ReverceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the name");

String name=sc.nextLine();
char ch;
String blank=" ";
for(int i=0;i<name.length();i++) {
	 ch=name.charAt(i);
	 blank=ch+blank;
	 
}
System.out.println(blank);
	}


}
