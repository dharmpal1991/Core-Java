package com.student.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.student.dao.StudentDAO;
import com.student.entities.StudentRegister;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Transactional
	public Integer studentRegForm(String studentRegistration) {
		Gson gson = new GsonBuilder().create();
		StudentRegister stuRegister = gson.fromJson(studentRegistration, StudentRegister.class);
		System.out.println(stuRegister);
		return studentDAO.studentRegForm(stuRegister);
	}

}
