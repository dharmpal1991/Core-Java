package com.student.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.student.bean.StudentAddressFilter;
import com.student.dao.StudentDAO;
import com.student.entities.StudentAddress;
import com.student.entities.StudentRegister;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Transactional

	public Integer studentRegForm(String stringJson) {
		Gson gson = new GsonBuilder().create();
		StudentAddressFilter filter = gson.fromJson(stringJson, StudentAddressFilter.class);
		
		logger.info("FIlter ",filter);
		StudentAddress address = new StudentAddress(filter.getEmail(), filter.getGender(),filter.getCountry(),filter.getState(),filter.getCity(), filter.getAddress(),filter.getZipcode(),filter.getContactno());
		
		StudentRegister register = new StudentRegister(filter.getFirstName(), filter.getLastName(),filter.getFullName(),filter.getPassword());
		address.setRegister(register);
		register.setStudentAddress(address);
	
		return studentDAO.studentRegForm(register);
		
	}

	public List<StudentRegister> listOfStudent() {
		return studentDAO.listOfStudent();
	}

	public void deleteStudent(Integer id) {
		studentDAO.deleteStudent(id);
	}


	public void studentUpdateRecord(String studentUpdate) {
		Gson gson = new GsonBuilder().create();
		StudentAddressFilter update = gson.fromJson(studentUpdate, StudentAddressFilter.class);
		logger.info("Update ",update);
		StudentAddress studentaddress = new StudentAddress(update.getEmail(), update.getGender(),update.getCountry(),update.getState(),update.getCity(), update.getAddress(),update.getZipcode(),update.getContactno());
			
		StudentRegister studentregister = new StudentRegister(update.getFirstName(),update.getLastName(),update.getFullName());
		studentaddress.setRegister(studentregister);
		studentregister.setStudentAddress(studentaddress);
		studentDAO.studentUpdateRecord(studentregister);
	}
}
