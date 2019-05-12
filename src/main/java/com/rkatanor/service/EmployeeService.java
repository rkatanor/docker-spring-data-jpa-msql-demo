package com.rkatanor.service;

import java.util.List;

import com.rkatanor.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);

	public List<Employee> getEmployees();
}
