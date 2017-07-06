package com.spring.service;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> listEmployee();
	
	public Employee getEmployee(int empId);
	
	public void deleteEmployee(Employee employee);
	

}
