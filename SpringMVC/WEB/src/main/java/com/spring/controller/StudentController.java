package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.beans.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String studentInfo(Model model) {
		model.addAttribute("Student", new Student());
		return "studentForm";

	}

	@RequestMapping(value = "/studentForm", method = RequestMethod.POST)
	public String studentDetail(@ModelAttribute("Student")  Student student, Model model,HttpServletRequest request) {
	   HttpSession session = request.getSession(false);
		session.setAttribute("MY_SESSION", student);
		model.addAttribute("Student", student);
		return "studentPage";
	}

	@RequestMapping(value = "/studentPage", method = RequestMethod.POST)
	public String studentLogin(@ModelAttribute("Student") Student student, Model model,HttpServletRequest request) {
		try {
			HttpSession  sesion =  request.getSession();
			Student student2 = (Student) sesion.getAttribute("MY_SESSION");
			model.addAttribute("Page_1_data",student2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "successPage";
	}

}