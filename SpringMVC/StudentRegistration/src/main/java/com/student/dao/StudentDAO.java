package com.student.dao;

import java.util.List;

import com.student.entities.StudentRegister;


public interface StudentDAO {
	
	Integer studentRegForm(StudentRegister studentRegister);
	List<StudentRegister>listOfStudent();
    void deleteStudent(Integer id);
    void studentUpdateRecord(StudentRegister studentUpdation);
	
}
