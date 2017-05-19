package com.honeywell.corpo.executor;

import com.honeywell.corpo.dataacces.accesor.EmployeeDAO;
import com.honeywell.corpo.dataaccess.entity.Employee;
import com.honeywell.corpo.dataaccess.entity.LocalUser;

public class App {

	public static void main(String[] args) {
		LocalUser lu = new LocalUser(200, "Dummy", "User2");
		Employee emp = new Employee(201, "Dummy1SSn", "Address1");
		emp.setFlocalUser(lu);
		EmployeeDAO edao = new EmployeeDAO();
		edao.addEmployee(emp);
	}

}
