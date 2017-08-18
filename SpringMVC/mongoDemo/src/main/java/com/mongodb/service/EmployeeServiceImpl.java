package com.mongodb.service;

import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired(required = true)
	private MongoTemplate mongoTemplate;
	
	protected static Logger logger = Logger.getLogger("service");

	public Boolean addEmployee(Employee employee) {
		logger.debug("Adding a new  employee");
		try{
			if(employee.getEmpId()!=null && employee.getEmpId()!= ""){
				DBObject query1 = new BasicDBObject();
				query1.put("empId", employee.getEmpId());
				DBObject query = new BasicDBObject();
				query.put("empId", employee.getEmpId());
				query.put("empName", employee.getEmpName());
				query.put("empAge", employee.getEmpAge());
				query.put("salary", employee.getSalary());
				query.put("empAddress", employee.getEmpAddress());
				mongoTemplate.getDb().getCollection("employee").update(query1, query);
			}
			else{
				employee.setEmpId(UUID.randomUUID().toString());
				mongoTemplate.save(employee);
			}
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public List<Employee> listEmployeess() {
		logger.debug("Retrieving all Employees");
		List<Employee> employees = mongoTemplate.findAll(Employee.class);
		return employees;
		
	}

	public Employee getEmployee(String empid) {
		logger.debug("Retrieving an existing Employee");
		Employee employee = new Employee();
		DBObject query = new BasicDBObject();
		query.put("empid", empid);
		DBObject cursor = mongoTemplate.getDb().getCollection("employee").findOne(query);
		employee.setEmpId(cursor.get("empid").toString());
		employee.setEmpId(cursor.get("empName").toString());
		employee.setEmpId(cursor.get("empAge").toString());
		employee.setEmpId(cursor.get("salary").toString());
		employee.setEmpId(cursor.get("empAddress").toString());
		return employee;
	}

	public Boolean deleteEmployee(String empid) {
		logger.debug("Deleting existing employee");
		try{
			DBObject query = new BasicDBObject();
			query.put("empId", empid);
			mongoTemplate.getDb().getCollection("employee").findAndRemove(query);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
