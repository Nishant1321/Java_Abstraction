package com.demo.Adhar.AdharCard_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
	@Id
private int adhar_number;
private String city;
@OneToOne
@JoinColumn(name="data")
private Person person;
public Adhar() {
	super();
	// TODO Auto-generated constructor stub
}
public Adhar(int adhar_number, String city, Person person) {
	super();
	this.adhar_number = adhar_number;
	this.city = city;
	this.person = person;
}
public int getAdhar_number() {
	return adhar_number;
}
public void setAdhar_number(int adhar_number) {
	this.adhar_number = adhar_number;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
@Override
public String toString() {
	return "Adhar [adhar_number=" + adhar_number + ", city=" + city + ", person=" + person + "]";
}

}
