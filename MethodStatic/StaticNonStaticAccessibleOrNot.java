package MethodStatic;

public class StaticNonStaticAccessibleOrNot {
	//non-static to non-static
	//public void m2(){
		//System.out.println("inside the non Static data");
		
	//}
	//public void m1() {
		//StaticNonStaticAccessibleOrNot obj =new  StaticNonStaticAccessibleOrNot();
		//obj.m2();
		//System.out.println("Nishant");
	//}
	//static to static
	static int a= 10;
	public static void m4(){
		//System.out.println(a);
		StaticNonStaticAccessibleOrNot obj = new StaticNonStaticAccessibleOrNot();
		obj.m3();
	}
	//non static to static
	public void m3() {
		System.out.println("Insid the non static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNonStaticAccessibleOrNot obj =new  StaticNonStaticAccessibleOrNot();
		//obj.m1();
		obj.m4();
		
	}

}
