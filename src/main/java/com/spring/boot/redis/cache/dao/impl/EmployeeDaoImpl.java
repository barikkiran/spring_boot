package com.spring.boot.redis.cache.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.boot.redis.cache.dao.EmployeeDao;
import com.spring.boot.redis.cache.model.Employee;
import com.spring.boot.redis.cache.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(Integer id) {

		return employeeRepository.findById(id).isPresent() ? employeeRepository.getOne(id) : null;
	}

	@Override
	public void deleteEmployeeById(Integer id) {

		employeeRepository.deleteById(id);
	}

	@Override
	public void deleteAllEmployee() {

		employeeRepository.deleteAll();
	}

}
