package com.honeywell.corpo.service;

import java.util.List;

import com.honeywell.corpo.model.Employee;

public interface EmployeeService {
	Employee findById(int id);
	List<Employee> findAllEmployees();
	boolean isEmployeeSsnUnique(Integer id, String ssn);
	void saveEmployee(Employee emp);
	Employee findEmployeeBySsn(String ssn);
	void updateEmployee(Employee employee);
	void deleteEmployeeBySsn(String ssn);
}
