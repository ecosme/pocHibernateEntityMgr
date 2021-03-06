package com.honeywell.corpo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.honeywell.corpo.dataaccess.EmployeeDao;
import com.honeywell.corpo.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee findById(int id) {
		return dao.findById(id);
	}
	
	
	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		Employee employee = findEmployeeBySsn(ssn);
		
		return ((employee == null) || ((id!=null) && (employee.getIdemployee() == id)));
	}

	@Override
	public void saveEmployee(Employee emp) {
		dao.saveEmployee(emp);
	}

	@Override
	public Employee findEmployeeBySsn(String ssn) {
		return dao.findEmployeeBySsn(ssn);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee entity = dao.findById(employee.getIdemployee());
		if (entity != null){
			entity.setfName(employee.getfName());
			entity.setlName(employee.getlName());
			entity.setSsn(employee.getSsn());
		}
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
	}

}
