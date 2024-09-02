package OopsConcept_Method;

public class Methods {
	//method = method is a block of  which is perform special type of action is called methods
	//non-static method
	public  void m1() {
		System.out.println("m1 block");
	}
	public void m2() {
		System.out.println("m2 block");
		
	}
	//static method
	public static String m3() {
		return "m3 block";
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if u print non static method then create object without create object cant print non static method
		Methods obj1=new Methods();
		obj1.m1();
		obj1.m2();
		//print static method then simple write class name.method name
		System.out.println(Methods.m3());
		
	}

}
