package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDTO;

public interface EmployeeService {
	
	List<EmployeeDTO> getAllEmployee();
	
	EmployeeDTO getEmployeeDetailById(String employeeId);
	
	List<EmployeeDTO> saveEmployee(EmployeeDTO employee);
	
	List<EmployeeDTO> deleteEmployeeById(String employeeId);
}
