package com.example.nnform.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
@RequestAnnotation
public class ContactForm {

	private int id;
	
	private String name;
	
	private String surname;

	private String mail;
	
	private String phone;
	private String address;
	private String contactReason;
	
	
	public int getId() {
		return id;
	}
	public ContactForm(String name, String surname,  String mail,  String phone, String address,
			String contactReason) {
		super();
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
		this.contactReason = contactReason;
	}
	public ContactForm() {
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactReason() {
		return contactReason;
	}
	public void setContactReason(String contactReason) {
		this.contactReason = contactReason;
	}
	
	
}
