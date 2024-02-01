package MethodStatic;

public class StaticBased {
	static int a = 100;
	{
		System.out.println("hello");
	}
public void a(){
	
	System.out.println("Nishant"+a);
	
	StaticBased obj =new StaticBased();
	System.out.println("a");
	
}
static {
System.out.println("ingawale");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticBased obj= new StaticBased();
		//obj.a();
		System.out.println("Nishant"+a);
	}

}
