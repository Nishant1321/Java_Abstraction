package OopsConcept_Abstraction;
import java.util.*;

public class Operation {
	static Scanner sc= new Scanner(System.in);
	public static void getToyato(){
 
System.out.println("Enter the choice : \npress 1 : fortuner\n press 2 : Glanza ");
switch(sc.nextInt()){
case 1:
	Fortuner ft= new Fortuner();
	ft.getName();
	ft.getFeature();
	ft.getMilage();
	ft.getPrize();
	break;
case 2:
	Glanza gn= new Glanza();
	gn.getName();
	gn.getFeature();
	gn.getMilage();
	gn.getPrize();
	break;
default :
	System.out.println("Enter the valid Number");
}
	}
public static void getMarutiSuzuki(){
	System.out.println("Enter the choice :\n press 1 : swift\n press 2 : Maruti800 ");
	switch(sc.nextInt()){	
case 1:
	Swift sw= new Swift();
	sw.getName();
	sw.getFeature();
	sw.getmilage();
	sw.getPrize();
	break;
case 2:
	Maruti800 mt= new Maruti800();
	mt.getName();
	mt.getFeature();
	mt.getmilage();
	mt.getPrize();
	break;
default :
	System.out.println("Enter the valid Number");
		
}


}

	}	


