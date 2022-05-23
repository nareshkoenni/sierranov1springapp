package com.sierranov1.sierranov1springapp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sierranov1.sierranov1springapp.dao.Employee;
import com.sierranov1.sierranov1springapp.service.IEmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeAction {
	@Autowired
	IEmployeeService empService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("register",new Employee());  // mapping the UI with Entity/model
		return "empRegistration";
	}
	
	@PostMapping("/add")
	public String registrationProcess(Employee employee) {
		empService.addEmployess(employee);
		return "home";
	}
	
}
