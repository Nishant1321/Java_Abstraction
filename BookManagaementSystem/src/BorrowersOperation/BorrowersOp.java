package BorrowersOperation ;

import java.sql.Date;

public class BorrowersOp {
private int borrowerid ;
private int bookid;
private String  bookname;
private Date issuedate;
private Date  submitdate;
private int  fine;
private String finestatus;
private int totalfine;
public int getBorrowerid() {
	return borrowerid;
}
public void setBorrowerid(int borrowerid) {
	this.borrowerid = borrowerid;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public Date getIssuedate() {
	return issuedate;
}
public void setIssuedate(Date issuedate) {
	this.issuedate = issuedate;
}
public Date getSubmitdate() {
	return submitdate;
}
public void setSubmitdate(Date submitdate) {
	this.submitdate = submitdate;
}
public int getFine() {
	return fine;
}
public void setFine(int fine) {
	this.fine = fine;
}
public String getFinestatus() {
	return finestatus;
}
public void setFinestatus(String finestatus) {
	this.finestatus = finestatus;
}
public int getTotalfine() {
	return totalfine;
}
public void setTotalfine(int totalfine) {
	this.totalfine = totalfine;
}
@Override
public String toString() {
	return "Borrowers [borrowerid=" + borrowerid + ", bookid=" + bookid + ", bookname=" + bookname + ", issuedate="
			+ issuedate + ", submitdate=" + submitdate + ", fine=" + fine + ", finestatus=" + finestatus
			+ ", totalfine=" + totalfine + "]";
}
public void Borrowers() {
	
}
}
