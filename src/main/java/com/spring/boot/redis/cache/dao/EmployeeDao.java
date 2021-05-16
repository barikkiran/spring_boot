package com.spring.boot.redis.cache.dao;

import java.util.List;

import com.spring.boot.redis.cache.model.Employee;

public interface EmployeeDao {

	void save(Employee employee);
	
	List<Employee> findAllEmployee();
	
	Employee findEmployeeById(Integer id);
	
	void deleteEmployeeById(Integer id);
	
	void deleteAllEmployee();
	
	
}
