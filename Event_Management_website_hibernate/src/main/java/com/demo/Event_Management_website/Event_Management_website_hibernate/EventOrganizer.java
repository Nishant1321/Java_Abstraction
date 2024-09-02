package com.demo.Event_Management_website.Event_Management_website_hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EventOrganizer {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int org_id;
	private String org_name;
	private String org_email;
	private long phoneNumber;
	private String  org_address;
	private String password;
	private List<EventOrganizer>EventOrganizer;
	public EventOrganizer(int org_id, String org_name, String org_email, long phoneNumber, String org_address,
			String password, List<EventOrganizer> eventOrganizer) {
		super();
		this.org_id = org_id;
		this.org_name = org_name;
		this.org_email = org_email;
		this.phoneNumber = phoneNumber;
		this.org_address = org_address;
		this.password = password;
		EventOrganizer = eventOrganizer;
	}
	public EventOrganizer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_email() {
		return org_email;
	}
	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrg_address() {
		return org_address;
	}
	public void setOrg_address(String org_address) {
		this.org_address = org_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<EventOrganizer> getEventOrganizer() {
		return EventOrganizer;
	}
	public void setEventOrganizer(List<EventOrganizer> eventOrganizer) {
		EventOrganizer = eventOrganizer;
	}
	@Override
	public String toString() {
		return "EventOrganizer [org_id=" + org_id + ", org_name=" + org_name + ", org_email=" + org_email
				+ ", phoneNumber=" + phoneNumber + ", org_address=" + org_address + ", password=" + password
				+ ", EventOrganizer=" + EventOrganizer + "]";
	}
	
	

}
