package Encapsulation;

public class Student {
int rollNumber;
String name;
String Department;

	//toString use for the convert memory store data to String
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", name=" + name + ", Department=" + Department + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj = new Student();
obj.Department="Cse";
obj.rollNumber=33;
obj.name="Nishant";
System.out.println(obj);
	}

}
