package com.student.bean;

public class StudentRegisterFilter {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String fullName;
	
	private String password;
	
	private StudentAddressBean studentAddress;

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

	public StudentAddressBean getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddressBean studentAddress) {
		this.studentAddress = studentAddress;
	}

	

}
