package com.spring.boot.redis.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.redis.cache.model.Employee;
import com.spring.boot.redis.cache.model.EmployeeRequestDTO;
import com.spring.boot.redis.cache.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(path = "/add",consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
		
		employeeService.save(employeeRequestDTO.getEmployee());
		
	}
	
	
	@GetMapping(path = "/all",produces = "application/json")
	public List<Employee> getAllEmployee(){
		
		return employeeService.getAllEmployee();
	}
	
	
	@GetMapping(path = "/id/{id}",produces = "application/json")
	public Employee getEmployeeById(@PathVariable Integer id) {
		
		return employeeService.getEmployeeById(id);
	}
	
}
