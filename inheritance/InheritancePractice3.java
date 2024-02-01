package inheritance;

public class InheritancePractice3 extends InheritancePractice2 {
	public void priti() {
	System.out.println("priti");
	}
	public static void main(String args[]) {
		 InheritancePractice obj=new  InheritancePractice();
		 obj.nishant();
		  InheritancePractice2 ob =new InheritancePractice2();
		  ob.nishant();
		  ob.Dipak();
		   InheritancePractice3 obk=new  InheritancePractice3();
		   obk.Dipak();
		   obk.nishant();
		   obk.priti();
		
	}

}
