package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * This method get all employees.
	 * 
	 * @return
	 */
	@GetMapping(value = "/getAllEmployees")
	public List<EmployeeDTO> GetAllEmployee() throws Exception
	{
		List<EmployeeDTO> employee = employeeService.getAllEmployee();
		return employee;
	}
	
	/**
	 * This method get employee by id.
	 * 
	 * @param employeeId
	 * @return
	 */

	@GetMapping(value = "/getEmployeeDetailById")
	public EmployeeDTO GetEmployeeDetailById(@RequestParam String employeeId) throws Exception
	{
		EmployeeDTO emplyoee = employeeService.getEmployeeDetailById(employeeId);
		return emplyoee;
	}
	
	/**
	 * This method saves the employee.
	 * 
	 * @param employee
	 * @return
	 */
	@PostMapping(value = "/saveEmployee")
	public List<EmployeeDTO> SaveEmployee(@RequestBody EmployeeDTO employee) throws Exception
	{
		List<EmployeeDTO> employeeList = employeeService.saveEmployee(employee);
		return employeeList;
	}
	/**
	 * This method deletes the employee. 
	 * 
	 * @param employeeId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/deleteEmployeeById")
	public List<EmployeeDTO> DeleteEmployeeById(@RequestParam String employeeId)throws Exception
	{
		List<EmployeeDTO> employeeList = employeeService.deleteEmployeeById(employeeId);
		return employeeList;
	}

}
