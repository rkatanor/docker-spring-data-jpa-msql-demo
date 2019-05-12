package com.rkatanor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkatanor.dao.EmployeeJpaRepository;
import com.rkatanor.model.Employee;
import com.rkatanor.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeJpaRepository repo;

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
