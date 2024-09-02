package EducationCollageName;
import java.util.*;
public abstract class Opration {
	public static void getDbatuCollegeInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the number :\n press 1 for the kbp\n press 2 for Yc");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Kbp obj =new Kbp();
			obj.getCollegeInfo();
			obj.getCollegeDeprt();
			obj.getCollegename();
			obj.getCollegeRank();
			
			
			break;
		case 2:
			Yc obj1 =new Yc();
			
			obj1.getCollegeInfo();
			obj1.getCollegeDeprt();
			obj1.getCollegename();
			obj1.getCollegeRank();
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	public static void getPuneUnict()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the number :\n press 1 for the PICT\n press 2 for Sinhgad");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Pict obj2 =new Pict();
			obj2.getPunecollegeInfo();
			obj2.getCollegeDeprt();
			obj2.getCollegename();
			obj2.getCollegeRank();
			
			
			break;
		case 2:
			Sihgad obj1 =new Sihgad();
			
			obj1.getPunecollegeInfo();
			obj1.getCollegeDeprt();
			obj1.getCollegename();
			obj1.getCollegeRank();
			break;
			default:
				System.out.println("Invalid Choice");
		}	
	}

}
