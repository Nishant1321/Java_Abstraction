package LibraryManagementSystem;

import java.util.ArrayList;

public class MultipleBook {
private ArrayList list;
public MultipleBook() {
	this.list=new ArrayList<Books>();
	
}
public void addintoList(Books bk) {
	list.add(bk);
	
}
public void save() {
	DataBase.saveToDb(list);
}
public void see() {
System.out.println(this.list);	
}

}
