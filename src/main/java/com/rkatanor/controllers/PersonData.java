package com.rkatanor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rkatanor.model.Employee;
import com.rkatanor.service.EmployeeService;

@RestController
@RequestMapping("/rest")
public class PersonData {
	@Autowired
	EmployeeService service;
	@GetMapping("/saveemp")
	public Employee saveEmployee(@RequestParam("id") int id, @RequestParam("name")  String name) {
		  Employee e=new Employee();
		  e.setId(id);
		  e.setName(name);
		  service.saveEmployee(e);
		  return e;
		
	}
	@GetMapping(value="/getemployees")
	public List<Employee> getEmployees(){
				return service.getEmployees();
	}
}
