package com.spring.boot.redis.cache.service;

import java.util.List;

import com.spring.boot.redis.cache.model.Employee;

public interface EmployeeService {

	
	void save(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployeeById(Integer id);
	
	void deleteAllEmployee();
}
