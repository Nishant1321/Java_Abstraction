package OopsConcept_Encapsulation;
import java.util.*;
public class EmpApp {
	static Employee emp=new Employee();
	static Scanner sc= new Scanner(System.in);
	public static void setData() {
	
	System.out.println("Enter the id");
	emp.setId(sc.nextInt());
	System.out.println("Enter the name");
	emp.setName(sc.next());
	System.out.println("Enter the salary");
	emp.setSalary(sc.next());
	
	}
	public static void getData() {
	
		System.out.println("id is :"+emp.getId());
		System.out.println("Name is :"+emp.getName());
		System.out.println("Salary is :"+emp.getSalary());
	}
	
	

}
