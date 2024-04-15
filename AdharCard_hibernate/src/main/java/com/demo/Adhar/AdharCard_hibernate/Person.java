package com.demo.Adhar.AdharCard_hibernate;

import org.hibernate.annotations.Cache;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Person {
@Id
	private int id;
	private String name;
	@OneToOne(mappedBy="person", cascade=CascadeType.MERGE)
	private Adhar adhar_details;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, Adhar adhar_details) {
		super();
		this.id = id;
		this.name = name;
		this.adhar_details = adhar_details;
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
	public Adhar getAdhar_details() {
		return adhar_details;
	}
	public void setAdhar_details(Adhar adhar_details) {
		this.adhar_details = adhar_details;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adhar_details=" + adhar_details + "]";
	}
	
	
}
