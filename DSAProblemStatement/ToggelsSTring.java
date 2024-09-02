package DSAProblemStatement;
import java.util.*;
public class ToggelsSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
StringBuilder toggel= new StringBuilder();

for(char c: str.toCharArray() ) {
	if(Character.isUpperCase(c)) {
	toggel.append(Character.toLowerCase(c));
}else {
	toggel.append(Character.toUpperCase(c));
}	
}
System.out.println(toggel.toString());
//		if(str ==str.toLowerCase()) {
//			System.out.println(str.toUpperCase().trim());
//		}else {
//			System.out.println(str.toLowerCase().trim());
//		}
	}

}
