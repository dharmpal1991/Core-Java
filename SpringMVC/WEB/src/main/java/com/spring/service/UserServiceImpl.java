package com.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.dao.UserDAO;
import com.spring.entities.UserRegister;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	//@Transactional
	public List<UserRegister> listOfUser() {
		
		return userDAO.listOfUser();
	}
	
	@Transactional
	public Integer createUser(String userRegistration) {
		Gson gson = new GsonBuilder().create();
		UserRegister register = gson.fromJson(userRegistration, UserRegister.class);
		logger.info(userRegistration);
		return userDAO.createUser(register);
	}

	public UserRegister readUser() {
		return userDAO.readUser();
	}

	@Transactional
	public Integer DeleteUser(String userDeletion) {
	
		Gson gson = new GsonBuilder().create();
		UserRegister reg = gson.fromJson(userDeletion, UserRegister.class);
		logger.info(userDeletion);
		return userDAO.DeleteUser(reg);
	}

}
