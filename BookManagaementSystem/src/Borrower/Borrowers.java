package Borrower;

import java.sql.Date;

public class Borrowers{
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Borrowers [id=" + id + ", name=" + name + "]";
}
public void Borrowers() {
	
}
}
