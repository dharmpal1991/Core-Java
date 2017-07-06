package com.spring.service;

import java.util.List;

import com.spring.entities.UserRegister;

public interface UserService {
	
	List<UserRegister> listOfUser();
	Integer createUser(String userRegistration);
	UserRegister readUser();
	Integer  DeleteUser(String userDeletion);

}
