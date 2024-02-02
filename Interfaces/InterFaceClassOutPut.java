package Interfaces;

public class InterFaceClassOutPut implements InterfaceClass {
public void m1() {
	System.out.println("m1");
}
public void m2() {
	System.out.println("m2");
}
public static void main(String args[]) {
	InterFaceClassOutPut obj =new InterFaceClassOutPut();
	obj.m1();
	obj.m2();
}
}
