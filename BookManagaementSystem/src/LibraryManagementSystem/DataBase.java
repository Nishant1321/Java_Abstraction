package LibraryManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class DataBase {
static Scanner sc = new Scanner(System.in);
public static void saveToDb(ArrayList<Books>list) {
Connection cn=Connect.getConnection();
try {
	int op=0;
	PreparedStatement st=cn.prepareStatement("insert into books(id,bookname,author,stock)values(?,?,?,?); ");
for(Books bk:list) {
	int id=bk.getBookid();
	String bookname=bk.getBookName();
	String author =bk.getAuthore();
	int stock = bk.getStock();
	st.setInt(1, id);
	st.setString(2, bookname);
	st.setString(3, author);
	st.setInt(4, stock);
	int a=st.executeUpdate();
	op=op+a;
}
System.out.println("Books Added Successfully "+op);

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
public static void getUpdate() {
	Connection co=Connect.getConnection();
	try {
	System.out.println("Enter the choice:\n  press 1 for the update book name\npress 2 for the update authore name \n press 3 for the update stock");
switch(sc.nextInt()) {
case 1:
	
		PreparedStatement st=co.prepareStatement("update books set bookname=? where id =? ");
	System.out.println("Enter the name for update:");
		st.setString(1,sc.next());
	System.out.println("Enter the id:");
	st.setInt(2, sc.nextInt());
	int a=st.executeUpdate();
	System.out.println("book name update success "+a);
	break;
	case 2:
		PreparedStatement st1=co.prepareStatement("update books set author=? where id =? ");
		System.out.println("Enter the author name for update:");
			st1.setString(1,sc.next());
		System.out.println("Enter the id:");
		st1.setInt(2, sc.nextInt());
		int b=st1.executeUpdate();
		System.out.println("book author name update success "+b);
		break;
	case 3:
		PreparedStatement st2=co.prepareStatement("update books set stock=? where id =? ");
		System.out.println("Enter the stock for update:");
			st2.setInt(1,sc.nextInt());
		System.out.println("Enter the id:");
		st2.setInt(2, sc.nextInt());
		int c=st2.executeUpdate();
		System.out.println("book stock update success "+c);
		break;
		
	} 
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}



}
public static void  getDelete() {
Connection co = Connect.getConnection();
try {
System.out.println("Enter the book id for the delete");
int id = sc.nextInt();

	PreparedStatement st = co.prepareStatement("delete from books where id=?");
System.out.println("Are youy sure to delete id:"+id);
System.out.println("Press 1 for the delete \n press 2 for the cancel");
int sure = sc.nextInt();
if(sure==1) {
	st.setInt(1, id);
	int a=st.executeUpdate();
	System.out.println("deleted :"+a);
	
}else {
	System.out.println("Cancelled");
}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
public static void display() {
	Connection co = Connect.getConnection();
	try {
		Statement st =co.createStatement();
	ResultSet rs =st.executeQuery("select * from books");
	while(rs.next()) {
		int id =rs.getInt("id");
		String bookname=rs.getString("bookname");
		String author=rs.getString("authore");
		int stock = rs.getInt("stock");
		
		
		System.out.println("Id"+id+"\nbookname :"+bookname+"\nauthore :"+author+"\n stock:"+stock);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
