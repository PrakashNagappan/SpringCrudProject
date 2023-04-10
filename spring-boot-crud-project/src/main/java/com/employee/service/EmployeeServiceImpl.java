package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	/**
	 *  Method to get employees
	 */
	@Override
	public List<EmployeeDTO> getAllEmployee() {
		ArrayList<EmployeeDTO> employee = new ArrayList<EmployeeDTO>();
		employee.add(new EmployeeDTO(1, "Mat", "Jhonsan", "jhonsan@gmail.com", "Rochester", "2487030111"));
		employee.add(new EmployeeDTO(2, "Phil", "Kotwick", "Kotwick@gmail.com", "Troy", "2487030112"));
		employee.add(new EmployeeDTO(3, "Jeff", "Ezaki", "JeffEzai@gmail.com", "Pontiac", "2487030113"));
		employee.add(new EmployeeDTO(4, "Chris", "dolly", "chrisdolly@gmail.com", "Formington", "2487030114"));
		return employee;
	}
	
	@Override
	public EmployeeDTO getEmployeeDetailById(@RequestParam String employeeId)
	{
		List<EmployeeDTO> employeeList = getAllEmployee();
		EmployeeDTO emplyoee = employeeList.stream().filter(emp -> employeeId.equalsIgnoreCase(String.valueOf(emp.getId())))
				.findAny().orElse(null);
		return emplyoee;
	}
	
	/**
	 * This method saves the employee.
	 * 
	 * @param employee
	 * @return
	 */
	@Override
	public List<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employee)
	{
		List<EmployeeDTO> employeeList = getAllEmployee();
		employeeList.removeIf(e -> String.valueOf(employee.getId()).equalsIgnoreCase(String.valueOf(e.getId())));
		EmployeeDTO emp = new EmployeeDTO(employee.getId(), employee.getFirstName(), employee.getLastName(),
				employee.getEmail(), employee.getAddress(), employee.getPhone());
		employeeList.add(emp);
		return employeeList;
	}
	/**
	 * This method deletes the employee. 
	 * 
	 * @param employeeId
	 * @return
	 */
	@Override
	public List<EmployeeDTO> deleteEmployeeById(@RequestParam String employeeId)
	{
		List<EmployeeDTO> employeeList = getAllEmployee();
		employeeList.removeIf(e -> employeeId.equalsIgnoreCase(String.valueOf(e.getId())));
		return employeeList;
	}
}
