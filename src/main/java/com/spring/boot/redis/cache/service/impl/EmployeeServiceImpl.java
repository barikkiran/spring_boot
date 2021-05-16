package com.spring.boot.redis.cache.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.redis.cache.dao.EmployeeDao;
import com.spring.boot.redis.cache.model.Employee;
import com.spring.boot.redis.cache.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void save(Employee employee) {

		employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeDao.findAllEmployee();
	}

	@Override
	public Employee getEmployeeById(Integer id) {

		return employeeDao.findEmployeeById(id);
	}

	@Override
	public void deleteEmployeeById(Integer id) {

		employeeDao.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployee() {

		employeeDao.deleteAllEmployee();
	}

}
