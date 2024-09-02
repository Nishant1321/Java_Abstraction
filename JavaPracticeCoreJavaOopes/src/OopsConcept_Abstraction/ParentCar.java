package OopsConcept_Abstraction;
import java.util.*;
public abstract class ParentCar {

	public abstract void getName();
	public abstract void getFeature();
	public abstract void getPrize();
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the choice :\n press 1 for : Toyata\n press 2 for : Maruti Suzuli");
	switch(sc.nextInt()) {
	case 1:
		Toyato.gettoyato();
		break;
	case 2:
		MarutiSuzuki.getMarutiSuzuki();
		break;
	default :
		System.out.println("Enter the valid Number");
	}
	}
}
