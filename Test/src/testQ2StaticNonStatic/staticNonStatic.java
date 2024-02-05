package testQ2StaticNonStatic;

public class staticNonStatic {
	// non static methods;
	public void m1() {
		System.out.println("Inside the m1");
	}
	public void m2() {
		
		System.out.println("Inside the m3");
	}
	public void m3() {
		staticNonStatic obj= new staticNonStatic();
		obj.m2();
		
	}
	//static methods 
	public static void  m4() {
		
		System.out.println("inside the static m4");
	}
public static void  m5() {
		
		System.out.println("inside the static m6");
	}
public static void  m6() {
	staticNonStatic.m5();
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticNonStatic obj = new staticNonStatic();
		obj.m1();
		obj.m2();
		staticNonStatic.m4();
		staticNonStatic.m5();
	}

}
