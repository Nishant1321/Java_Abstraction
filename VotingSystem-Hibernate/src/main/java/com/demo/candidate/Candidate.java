package com.demo.candidate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@Column(name="candidateName")
private String name;
	@Transient
private int votes;
private String party;
private int  age;
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
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Candidate [id=" + id + ", name=" + name + ", votes=" + votes + ", party=" + party + ", age=" + age + "]";
}
public Candidate() {
	super();
	// TODO Auto-generated constructor stub
}



}
