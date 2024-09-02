package com.demos.constructor;

public class Students {
	private int rollnumber;
	private String name;
	private String city;
	public Students(int rollnumber, String name, String city) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.city = city;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Students [rollnumber=" + rollnumber + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
