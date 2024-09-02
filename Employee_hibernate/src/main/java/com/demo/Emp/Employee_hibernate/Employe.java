package com.demo.Emp.Employee_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
	@Id
	private int emp_id;
private String emp_name;
private double emp_salary;

public Employe(int emp_id, String emp_name, double emp_salary) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_salary = emp_salary;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public double getEmp_salary() {
	return emp_salary;
}
public void setEmp_salary(double emp_salary) {
	this.emp_salary = emp_salary;
}
@Override
public String toString() {
	return "Employe [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
}



}
