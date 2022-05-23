package com.sierranov1.sierranov1springapp.service;

import java.util.List;
import java.util.Optional;

import com.sierranov1.sierranov1springapp.dao.Employee;

public interface IEmployeeService {
	List<Employee> getEmployees();
	Employee addEmployess(Employee emp);
	Optional<Employee> findEmployeeById(int empID);
}
