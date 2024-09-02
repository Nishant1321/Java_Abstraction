package LibraryManagementSystem;

import java.util.Scanner;

import Borrower.BarrowerOperation;

public class Library {
static {
	System.out.println("Welcome to Library");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarrowerOperation bp=new BarrowerOperation();
		BookOperation bo= new BookOperation();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the choice :\n press 1 for the Books \n press 2 for the borrower");
switch(sc.nextInt()) {
case 1:
	bo.BooksOperation();
	break;
case 2:
	bp.BorrowerOperation();
	break;
case 3:
	break;
	
}
	}

}
