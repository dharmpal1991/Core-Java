package com.student.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entities.StudentRegister;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public Integer studentRegForm(StudentRegister studentRegister) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Integer id = (Integer) session.save(studentRegister);
		transaction.commit();
		return id;
	}

	private Session getSession() {
		Session session = this.sessionFactory.getCurrentSession();
		
		return session;
	}

}
