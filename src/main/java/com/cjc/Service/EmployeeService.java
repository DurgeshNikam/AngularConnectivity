package com.cjc.Service;

import java.util.List;



import com.cjc.Model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	
}
