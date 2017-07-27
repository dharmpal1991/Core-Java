package com.student.bean;

import com.student.entities.StudentRegister;

public class StudentAddressBean {
	
	private Integer id;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Integer zipcode;
	
	private Long contactno;
	
	private String email;
	
	private String gender;

	private StudentRegister register;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Long getContactno() {
		return contactno;
	}

	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public StudentRegister getRegister() {
		return register;
	}

	public void setRegister(StudentRegister register) {
		this.register = register;
	}
	
	

}
