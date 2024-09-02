package OopsConcept_Interface;
import java.util.*;
public class Operations {
	static Scanner sc= new Scanner(System.in);
	public static void getCollege() {
System.out.println("Enter the choice :\n press 1 for : kbp\n press 2 for :DCE");
switch(sc.nextInt()) {
case 1:
	Kbp k= new Kbp();
System.out.println(	k.collegeName());
	System.out.println( k.departMentName());
System.out.println(	k.className());
	break;
case 2:
	DCE d= new DCE();
System.out.println(	d.departMentName());
System.out.println(	d.collegeName());
	System.out.println( d.className());
	break;
	default:
		System.out.println("Invalid Number");
}


}
	public static void getSport() {
		System.out.println("Enter the choice :\n press 1 for : Cricket\n press 2 for :Football");
		switch(sc.nextInt()) {
		case 1:
			Creicket kt= new Creicket();
	System.out.println(		kt.getDiet());
	System.out.println(		kt.getPractice());
			break;
		case 2:
			Football ft = new Football();
		System.out.println(	ft.getDiet());
		System.out.println(	ft.getPractice());
			break;
			default:
				System.out.println("Invalid Number");
		}


		}
}