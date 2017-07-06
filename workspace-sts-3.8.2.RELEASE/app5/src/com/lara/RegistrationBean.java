package com.lara;

import java.util.Arrays;

public class RegistrationBean {
	private String firstName;
	private String lastName;
	private String gender;
	private String education;
	private String[] skills;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String i) {
		this.gender = i;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String i) {
		this.education = i;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "RegistrationBean [firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", education=" + education
				+ ", skills=" + Arrays.toString(skills) + "]";
	}
	public void setSkills(Object[] array) {
		// TODO Auto-generated method stub
		
	}
	public void setSkills(String[] array) {
		// TODO Auto-generated method stub
		
	}
	

}
