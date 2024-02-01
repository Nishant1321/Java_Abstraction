package Contrustor;

public class ConstructorOverLoading {
	public void ConstructorOverLoading(){
		System.out.println("null constructor");
	}
	public void ConstructorOverLoading(int a){
		System.out.println("int constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoading obj = new ConstructorOverLoading();
		obj.ConstructorOverLoading();
		obj.ConstructorOverLoading( 10);
	}

}
