package com.demo.Adhar.AdharCard_hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Contact {
	@Id
private int Contact_id;
private long Contact_number;
@ManyToOne
private Voter voter;
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public Contact(int contact_id, long contact_number, Voter voter) {
	super();
	Contact_id = contact_id;
	Contact_number = contact_number;
	this.voter = voter;
}
public int getContact_id() {
	return Contact_id;
}
public void setContact_id(int contact_id) {
	Contact_id = contact_id;
}
public long getContact_number() {
	return Contact_number;
}
public void setContact_number(long contact_number) {
	Contact_number = contact_number;
}
public Voter getVoter() {
	return voter;
}
public void setVoter(Voter voter) {
	this.voter = voter;
}
@Override
public String toString() {
	return "Contact [Contact_id=" + Contact_id + ", Contact_number=" + Contact_number + ", voter=" + voter + "]";
}


}
