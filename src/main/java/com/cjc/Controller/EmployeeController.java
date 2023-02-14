package com.cjc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.Model.Employee;
import com.cjc.Service.EmployeeService;


@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployee(){
		
		return service.getAllEmployee();
	}
	
	@PutMapping("/putEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee , @PathVariable int id) {
	
	return service.updateEmployee(employee);
	}
}
