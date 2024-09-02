package Borrower;


import java.util.ArrayList;

public class MultyBorrower {
private ArrayList list;
public MultyBorrower() {
	this.list=new ArrayList<Borrowers>();
}
public void addBorrower(Borrowers bv) {
	list.add(bv);
}
public void save() {
	DatabaseBarrower.saveToDb(list);
}
}
