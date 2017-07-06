package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entities.UserRegister;
import com.spring.service.UserService;

import flexjson.JSONSerializer;


@Controller
public class UserRegistrationController {
		
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/userRegistration",method = RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestParam(value="userRegistration")String userRegistration,HttpServletRequest request, HttpServletResponse response){
		
		Integer id = userService.createUser(userRegistration);
		JSONSerializer jsonSerializer = new JSONSerializer();
		String str = jsonSerializer.serialize("Ok");
		return str;
	}
	@RequestMapping (value = "/getdata",method = RequestMethod.GET)
	public String getData(Model model){
		
	List <UserRegister> list   = userService.listOfUser();
	model.addAttribute("UserRegistration",list);
		return "returndata";
	}
	
	@RequestMapping(value ="/userDeletion",method = RequestMethod.POST)
	@ResponseBody
	public String deleteUser(@RequestParam(value="userDeletion") String userDeletion){
		Integer id = userService.DeleteUser(userDeletion);
		return "returndata";
	}
}
