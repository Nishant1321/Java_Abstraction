package ArrayProblem;

import java.io.PrintStream;
import java.util.Scanner;

public class StringExample {
	public static String getAlphabet(String alpha){
		StringBuilder result = new StringBuilder();

		
		  for (int i = 0; i < alpha.length(); i++) {
	            char currentChar = alpha.charAt(i);
	            if (Character.isLetter(currentChar)) {
	            
					result.append(Character.toUpperCase(currentChar)).append(Character.toLowerCase(currentChar));
	                if (i < alpha.length() - 1) {
	                    result.append("-");
	                }
	            }
	        }
		
		
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String alpha=sc.next();
		String output=getAlphabet(alpha);
		System.out.println("string is :"+output );
	}

}
