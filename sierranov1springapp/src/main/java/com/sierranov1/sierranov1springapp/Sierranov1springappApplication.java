package com.sierranov1.sierranov1springapp;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sierranov1.sierranov1springapp.dao.Employee;
import com.sierranov1.sierranov1springapp.service.EmployeeService;

@SpringBootApplication
public class Sierranov1springappApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Sierranov1springappApplication.class, args);  // taking the spring container object
		System.out.println("hello this is from spring client");
	/*	EmployeeService employeeService = container.getBean(EmployeeService.class);  // getting the bean object
		List<Employee> list=employeeService.getEmployees(); //calling the service  methods
		for (Employee employee : list) {
			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptId());
		}
	/*	
		Optional<Employee> emp = employeeService.findEmployeeById(114);
		if(emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptId());
		}  */
	}
}
