package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entities.UserRegister;

@Repository
//@Transactional
public class UserDAOImpls implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public List<UserRegister> listOfUser() {
		Session session = getSession();
		Transaction trans = session.getTransaction();
		trans.begin();
		Query query = session.createQuery("from UserRegister ");
		List<UserRegister> gettingdata = query.list();
		return gettingdata;
	}
	
	@Transactional
	public Integer createUser(UserRegister userRegistration) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Integer id =  (Integer) session.save(userRegistration);
		trans.commit();
		return id;
	}

	public UserRegister readUser() {
		return null;
	}
	
	public Session getSession(){
		Session session = this.sessionFactory.getCurrentSession();
		return session;
	}

	public Integer DeleteUser(UserRegister userRegister) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		int id = userRegister.getId();
		Integer id1  = session.createSQLQuery("Delete from user_register where id = "+id).executeUpdate();
		trans.commit();
		return id1;
	}

	
}
