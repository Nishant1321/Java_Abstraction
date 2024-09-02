package ArrayProblem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class StudentsSort {
	static Scanner sc = new Scanner(System.in);
	public  static Collection<? extends StudentsSort> getStude() {
		
System.out.println("Enter the name ");
		String name=sc.next();
		System.out.println("Enter the gender");
		String gender =sc.next();
		return StudentsSort.getStude();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentsSort std=new StudentsSort();
List<StudentsSort> student=new ArrayList();
student.addAll(StudentsSort.getStude());







	}

}
