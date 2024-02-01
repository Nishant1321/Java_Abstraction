package MethodStatic;

public class SataticOverLoading {
public static void  m1() {
	System.out.println("nun parameter");
}
public static void m1(int a)
{
	System.out.println("int a parameter");
	
	}
public static void m1(int a,String b)
{
	System.out.println("int a parameter and String b");
	
	}
public static void main(String args[]) {
	SataticOverLoading.m1();
	SataticOverLoading.m1(10);
	SataticOverLoading.m1(115, "kbp");
}
}
