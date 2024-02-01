package Contrustor;

public class OverloadingCheck {
	// new constructor;
	OverloadingCheck(int a){
		System.out.println("inside the constructor");
	}
	// new constructor override with default constructor;
	// default constructor;
	OverloadingCheck(){
		System.out.println("null constructor");
	}
	public  void m1() {
		System.out.println("inside m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if you print constructor then create the default constructor and then execute;
		OverloadingCheck obj= new OverloadingCheck( );
		obj.m1();
	}

}
