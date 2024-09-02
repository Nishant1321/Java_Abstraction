package Car;

import java.util.Scanner;

public abstract class Operation {
	public static void getMsDilers(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the choice : press 1 for the Safari\npress 2 for  Hariier the ");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		Safari obj = new Safari();
		obj.getMilage();
		obj.getColour();
		obj.getDilers();
		obj.getFeatures();
		break;
	case 2:
		Hariier obj1 = new Hariier();
		obj1.getMilage();
		obj1.getColour();
		obj1.getDilers();
		obj1.getFeatures();
		break;
		default:
		System.out.println("invalid choice");	
	}		
	
}
	public static  void gettoyataDilers(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the choice : press 1 for the Supra\npress 2 for Fortuner the ");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		Supra obj =  new Supra();
		obj.getMilage();
		obj.getColour();
		obj.getDeliers();
		obj.getFeatures();
		break;
	case 2:
		Fortuner obj1 = new Fortuner();
		obj1.getMilage();
		obj1.getColour();
		obj1.getDeliers();
		obj1.getFeatures();
		break;
		default:
			System.out.println("invalid choice");	
	}		
	
}
	public static  void gettataDilers(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the choice : press 1 for the Swift\npress 2 for the Balino ");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		Swift obj = new Swift();
		obj.getMilage();
		obj.getColour();
		obj.getDilers2();
		obj.getFeatures();
		break;
	case 2:
		Balino obj1 = new Balino();
		obj1.getMilage();
		obj1.getColour();
		obj1.getDilers2();
		obj1.getFeatures();
		break;
		default:
			System.out.println("invalid choice");	
	}		
	
}	

	
}
