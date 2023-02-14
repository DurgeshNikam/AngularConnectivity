package com.cjc.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.Dao.EmployeeDao;
import com.cjc.Model.Employee;
import com.cjc.Service.EmployeeService;
@Service
public class EmployeeServiceIMPL  implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee saveEmployee(Employee employee) {
	
		return dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
	return	 dao.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return dao.save(employee);
	}

	
		
	

}
