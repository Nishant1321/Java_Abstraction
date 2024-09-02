package ArrayProblem;

import java.util.Scanner;

public class AtmPin {
	static Scanner sc= new Scanner(System.in);
public static boolean validePin(String pin) {
	int l=pin.length();
	int ct =0;
	for(int i =0;i<l;i++) {
		if(pin.charAt(i)>='0' && pin.charAt(i)<='9') {
			ct++;
		}
		
	}
	System.out.println(ct);
	if(ct==4 || ct==6) {
	return true;
	}
	else {
		return false;
	
	}
	
}
public static void main(String[] args) {
	
	System.out.println("enter the pin");
	String pin=sc.next();
	System.out.println("result is "+ AtmPin.validePin(pin));
	
	
}
}
