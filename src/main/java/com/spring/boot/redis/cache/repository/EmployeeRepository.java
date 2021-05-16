package com.spring.boot.redis.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.redis.cache.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
