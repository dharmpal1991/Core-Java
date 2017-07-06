package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> listEmployee();
	
	public Employee getEmployee(int empId);
	
	public void deleteEmployee(Employee employee);

}