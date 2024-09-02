package StringAll;
import java.util.*;
public class StringAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

StringBuilder sb= new StringBuilder("Nishant");
System.out.println(sb);
for(int i=0;i<sb.length();i++) {
	System.out.println(sb.charAt(i));
}
//set character at index
sb.setCharAt(0, 'P');
//System.out.println(sb);
//insert character at index
sb.insert(1,'r');
//System.out.println(sb);
//delete String
sb.delete(6, 8);
//System.out.println(sb);
//apeend means join
sb.append("nt");
//System.out.println(sb);
	}

}
