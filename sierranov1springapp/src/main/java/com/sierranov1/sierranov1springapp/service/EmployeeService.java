package com.sierranov1.sierranov1springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sierranov1.sierranov1springapp.dao.Employee;
import com.sierranov1.sierranov1springapp.dao.IEmployeeDAO;
@Component
public class EmployeeService implements IEmployeeService{
	@Autowired
	IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}

	@Override
	public Employee addEmployess(Employee emp) {
		// TODO Auto-generated method stub
		return empDAO.save(emp);
	}

	@Override
	public Optional<Employee> findEmployeeById(int empID) {
		// TODO Auto-generated method stub
		return empDAO.findById(empID);
	}
}
