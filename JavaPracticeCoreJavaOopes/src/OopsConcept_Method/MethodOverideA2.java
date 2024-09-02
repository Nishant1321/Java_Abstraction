package OopsConcept_Method;

public class MethodOverideA2  extends MethodOverideA1 {
	public static String m1(String a) {
		return  "vishal";
	}
	public int m1(int a) {
		return 15;
	}
	public static void main(String args[]) {
		
	System.out.println(MethodOverideA2.m1("Nishant"));
	System.out.println(MethodOverideA2.m1("Vishal"));
		MethodOverideA2 obj1 = new MethodOverideA2();
		System.out.println(obj1.m1(10));
		obj1.m1(15);
	}
}
