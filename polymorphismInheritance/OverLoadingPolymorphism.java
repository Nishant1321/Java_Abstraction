package polymorphismInheritance;
// overloading 
//Compile time polymorphism;+
public class OverLoadingPolymorphism {
	public void m1() {
		System.out.println("no parameter");
	}
	public void m1(int a) {
		System.out.println("int 1 parameter");
	}
	public void m1(int a ,int b) {
		System.out.println("int a, int b parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingPolymorphism obj= new OverLoadingPolymorphism();
		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
		
	}

}
