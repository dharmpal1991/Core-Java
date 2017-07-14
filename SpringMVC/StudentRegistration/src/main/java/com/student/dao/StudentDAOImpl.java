package com.student.dao;

import java.util.List;

import org.hibernate.Query;
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

	public List<StudentRegister> listOfStudent() {
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Query query = session.createQuery("from StudentRegister");
		List<StudentRegister> studentData = query.list();
		transaction.commit();
		
		return studentData;
	}

	public void deleteStudent(Integer id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		Object st=session.get(StudentRegister.class, id);
		session.delete(st);
		transaction.commit();
		
	}

	public void studentUpdateRecord(StudentRegister register) {
		Session session = getSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.update(register);
		tx.commit();
	}
}
