package com.spring.dao;

import java.util.List;

import com.spring.entities.UserRegister;

public interface UserDAO {
	
	List<UserRegister> listOfUser();
	Integer createUser(UserRegister userRegistration);
	UserRegister readUser();
	Integer DeleteUser(UserRegister userDeletion);
}
