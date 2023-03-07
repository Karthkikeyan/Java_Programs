package com.te.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springsecurity.entity.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, String> {

	public Employee findByEmpId(String empId);
	
}
