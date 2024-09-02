package StringAll;
import java.util.*;
public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

//String [] fruits= {"apple","banana","per","lemon"};
//
//for(int i=fruits.length-1;i>=0;i--) {
//	System.out.println(fruits[i]);
//}


//reverse String 
System.out.println("Enter the String");
String name=sc.nextLine();
char ch;
String blank=" ";

for(int i=0;i<name.length();i++) {
	ch=name.charAt(i);
	blank=ch+blank;
	
	
}
System.out.println("the reverse string is : " +blank);

	}

}
