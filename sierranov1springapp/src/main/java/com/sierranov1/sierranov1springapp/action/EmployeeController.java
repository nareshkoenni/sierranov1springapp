package com.sierranov1.sierranov1springapp.action;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sierranov1.sierranov1springapp.dao.Employee;
import com.sierranov1.sierranov1springapp.service.IEmployeeService;

@RestController   //for REST APIs
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	IEmployeeService empService;
	
	@GetMapping("/view")
	List<Employee> getEmployees(){
		return empService.getEmployees();
	}
	
	@GetMapping("/find/{empId}")
	Employee findEmployee(@PathVariable(name="empId") int empId) {
		Optional<Employee> optional = empService.findEmployeeById(empId);
		return optional.get();
	} 
	
	@PostMapping("/add")
	Employee addEmployee(@RequestBody Employee emp) {
		return empService.addEmployess(emp);
	}
	
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello Spring Boot with Azure";
	}

}
