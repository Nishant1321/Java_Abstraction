package com.demo.Courses.Course_hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
private int rollNumber;
	
private String name;
@ManyToMany(mappedBy="student")
private List<Course> course;
public Student(int rollNumber, String name, List<Course> course) {
	super();
	this.rollNumber = rollNumber;
	this.name = name;
	this.course = course;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + "]";
}

}




