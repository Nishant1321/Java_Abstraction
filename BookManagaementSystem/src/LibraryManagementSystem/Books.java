package LibraryManagementSystem;

public class Books {
private int bookid;
private String bookName;
private String authore;
private int stock;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthore() {
	return authore;
}
public void setAuthore(String authore) {
	this.authore = authore;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Books [bookid=" + bookid + ", bookName=" + bookName + ", authore=" + authore + ", stock=" + stock + "]";
}
public void Books() {
	
}
	
}
