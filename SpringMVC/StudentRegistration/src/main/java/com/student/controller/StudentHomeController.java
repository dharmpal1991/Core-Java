package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.entities.StudentRegister;
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
		stuService.studentRegForm(studentRegistration);
		return "index";
		
	}
	@RequestMapping (value = "/studentgetdata",method = RequestMethod.GET)
	public String getData(Model model){
		
		List <StudentRegister> list   = stuService.listOfStudent();
		model.addAttribute("studentRegistration",list);
		return "studentReturnData";
	}
	@RequestMapping(value="/studentDelete/{id}")
	public String studentDeleteRecord(@PathVariable Integer id){
		stuService.deleteStudent(id);
		return "redirect:/studentgetdata";
	}
	
	@RequestMapping(value = "/studentUpdation",method = RequestMethod.POST)
	@ResponseBody
	public String studentUpdation(@RequestParam(value = "studentUpdation")String studentUpdation){
		System.out.println(studentUpdation);
		stuService.studentUpdateRecord(studentUpdation);
		return "studentgetdata";
	}
	
}
