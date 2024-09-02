package LibraryManagementSystem;

import java.util.Scanner;

public class BookOperation {
	static DataBase bc=new DataBase();
	static Scanner sc = new Scanner(System.in);
	static MultipleBook mk= new MultipleBook();
public static void createBook() {
	int ch=1;
	while(ch==1) {
	Books bk=new Books();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Book Id");
	int bookId=sc.nextInt();
	System.out.println("Enter the book name");
	String bookName=sc.next();
	System.out.println("Enter the book authore");
	String authore=sc.next();
	System.out.println("Enter the book stock");
	int stock=sc.nextInt();
	bk.setBookid(bookId);
	bk.setBookName(bookName);
	bk.setAuthore(authore);
	bk.setStock(stock);
	mk.addintoList(bk);
	mk.see();
	System.out.println("press 1 for the add more the book \n press 2 for the save info");
ch=sc.nextInt();
if(ch==2) {
	mk.save();
}

}
}
public void BooksOperation() {
	boolean b= true;
	while(b) {
		System.out.println("Enter the choice : \n press 1 for the registration \n press 2 for the update\n press 3  for the delete\n press 4 for the display\n press 5 for the exist");
		switch(sc.nextInt()) {
		case 1:
			BookOperation.createBook();	;
			break;
		case 2:
			DataBase.getUpdate();
			break;
		case 3:
			DataBase.getDelete();
			break;
		case 4 :
			DataBase.display();
			break;
		case 5:
			b=false;
			break;
		}
	}
}
}
