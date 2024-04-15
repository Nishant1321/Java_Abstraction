package com.demo.Adhar.AdharCard_hibernate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Voter {
	@Id
private int id;
private String name;
@OneToMany(mappedBy="voter",fetch= FetchType.LAZY,cascade=CascadeType.MERGE)
private List<Contact>contact;
public Voter() {
	super();
	// TODO Auto-generated constructor stub
}
public Voter(int id, String name, List<Contact> contact) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
}
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
public List<Contact> getContact() {
	return contact;
}
public void setContact(List<Contact> contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Voter [id=" + id + ", name=" + name + ", contact=" + contact + "]";
}

}
