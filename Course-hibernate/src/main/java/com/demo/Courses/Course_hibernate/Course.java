package com.demo.Courses.Course_hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
private int course_id;
private String course_name;
@ManyToMany

private List<Student> student;
public Course(int course_id, String course_name, List<Student> student) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.student = student;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [course_id=" + course_id + ", course_name=" + course_name + ", student=" + student + "]";
}


}
