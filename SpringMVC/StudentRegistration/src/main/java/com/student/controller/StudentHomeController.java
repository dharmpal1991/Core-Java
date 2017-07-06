package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.service.StudentService;

@Controller
public class StudentHomeController {
	
	@Autowired
	StudentService stuService;
	
	@RequestMapping(value ="/studentReg",method = RequestMethod.GET)
	public String logInStudent(){
		return "studentRegForm";
		
	}
	
	@RequestMapping(value ="/studentSubmittionForm",method = RequestMethod.POST)
	@ResponseBody
	public String studentRegForm(@RequestParam(value = "studentRegistration")String studentRegistration){
		Integer id = stuService.studentRegForm(studentRegistration);
		return "index";
		
	}
}