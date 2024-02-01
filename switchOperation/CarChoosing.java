package switchOperation;
import java.util.*;
public class CarChoosing {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*****welcome to .....Electronics****");
System.out.println("Choose the car fav car company");
String favCAr=sc.next();
switch(favCAr){
case "tata":
	System.out.println("welcome to tata");
	Operations.getTata();
	
	break;
case "toyata":
	System.out.println("welcome to toyata");
	Operations.getToyata();
	break;
case "mahindra":
	System.out.println("welcome to mahindra");
	Operations.getMAhindra();
	break;
	default:
		System.out.println("invalid car");
		break;
}
}

	
	
}




