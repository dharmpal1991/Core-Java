package com.student.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="student_Registration")
public class StudentRegister implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "student_id")
	private Integer id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "register", cascade = CascadeType.ALL)
	private StudentAddress studentAddress;
	
	public StudentRegister() {
	
	}
	
	public StudentRegister(String firstName, String lastName, String fullName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.password = password;
	}
	
	public StudentRegister(String firstName, String lastName, String fullName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
	
	}
	
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}
