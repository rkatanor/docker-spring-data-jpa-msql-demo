package com.rkatanor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkatanor.model.Employee;
@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long>{

}
