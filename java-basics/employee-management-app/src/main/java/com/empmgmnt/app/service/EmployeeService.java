package com.empmgmnt.app.service;

import com.empmgmnt.app.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	
	public Employee searchEmployeeById(int employeeId);
	
}