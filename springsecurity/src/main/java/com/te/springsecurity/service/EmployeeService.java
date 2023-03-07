package com.te.springsecurity.service;

import com.te.springsecurity.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(String empId);
}
