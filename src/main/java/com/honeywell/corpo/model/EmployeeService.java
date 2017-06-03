package com.honeywell.corpo.model;

import java.util.List;


public interface EmployeeService {
	List<Employee> findAllEmployees();
	boolean isEmployeeSsnUnique(int id, String ssn);
	void saveEmployee(Employee emp);
}
