package com.Incapsulation;

import java.util.Scanner;

public class App {
	static Scanner sc =new Scanner(System.in);
	static	Empployee obj =new Empployee();
	public static void setData() {
		
		System.out.println("Enter the Employ id");
		int id = sc.nextInt();
	    obj.setEmpId(id);
		System.out.println("Enter the Employ Name");
		String Name=sc.next();
		obj.setName(Name);
		System.out.println("Enter the Employ Salary" );
		String Salary=sc.next();
		obj.setSalary(Salary);
		
		
	}
public  static void getData() {
	
	
	System.out.println("get the Employ id"+obj.getEmpId());
	System.out.println("get the Employ name"+obj.getName());
	System.out.println("get the Employ Salary"+obj.getSalary());
}
}
