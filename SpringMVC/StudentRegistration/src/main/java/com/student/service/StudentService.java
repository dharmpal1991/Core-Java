package com.student.service;

import java.util.List;

import com.student.entities.StudentRegister;

public interface StudentService {
	
	Integer studentRegForm( String studentRegistration);
	
	List<StudentRegister>listOfStudent();
	
	void deleteStudent(Integer id);
	
	 void studentUpdateRecord(String studentUpdation);

}
