package com.student.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "student_Address")
public class StudentAddress implements Serializable {
	
	public StudentAddress() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zip_code")
	private Integer zipcode;
	
	@Column(name = "contact_no")
	private Long contactno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;

	@OneToOne
	private StudentRegister register;
	
	public StudentAddress(String email, String gender, String country, String state, String city, String address,
			Integer zipcode, Long contactno) {
		super();
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.state = state;
		this.city = city;
		this.address = address;
		this.zipcode = zipcode;
		this.contactno = contactno;
	}
	
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
