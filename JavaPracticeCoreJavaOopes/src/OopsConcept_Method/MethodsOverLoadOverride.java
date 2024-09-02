package OopsConcept_Method;

public class MethodsOverLoadOverride {
//method can be overloade
	public void m1(int a) {
	System.out.println(a);
	}
	public void m1(String a) {
	System.out.println(a);	
	}
	public static String m2(String firstName) {
		return firstName;
	}
	public static String m2(String LastName, String middleName) {
		return LastName +" " + middleName;
	}
	public static void main(String args[]) {
		MethodsOverLoadOverride obj=new MethodsOverLoadOverride();
		obj.m1(10);
		obj.m1("Nishant");
		System.out.println(MethodsOverLoadOverride.m2("chimu"));
		
		System.out.println(MethodsOverLoadOverride.m2("Ingawale", "Ashok"));
		
	}
	
	
	
}
