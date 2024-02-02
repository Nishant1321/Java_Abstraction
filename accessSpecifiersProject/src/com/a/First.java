package com.a;

public class First {
	private String pt= "private";// range only same class;
	String df="Default";//Range As Same package;
	public String pb="Public";//Range whole the Project and import the package in another package;

	protected String prt="Protected";//protected range same as Defaulter but if u access in different package then extends the class and access the protected and also import package in another package 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//All the Access Specifiers Accessible;
First obj=new First();

System.out.println("private "+obj.pt);
System.out.println(obj.df+"Default");
System.out.println(obj.pb+"Public");
System.out.println(obj.prt+"Protected");



	}

}
