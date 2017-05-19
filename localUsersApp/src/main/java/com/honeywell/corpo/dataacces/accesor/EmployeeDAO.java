package com.honeywell.corpo.dataacces.accesor;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.honeywell.corpo.dataaccess.entity.Employee;

public class EmployeeDAO {

	public void addEmployee(Employee emp){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		addEmployee(session, emp);
		tx.commit();
		session.close();
	}
	
	private void addEmployee(Session session, Employee emp){
		Employee empIn = new Employee();
		session.save(empIn);
		session.save(emp);
	}
	
	public List<Employee> getEmployees(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Employees");
		List<Employee> employees = query.list();
		session.close();
		return employees;
	}
	
	public int deleteEmployee(int id){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Employees where idEmployee = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("Affected Rows: "+ rowCount);
		tx.commit();
		session.close();
		return rowCount;
	}
	
	public int updateEmpployee(int id, Employee emp){
		if (id <= 0) return 0;
			Session session = SessionUtil.getSession();
			Transaction tx = session.getTransaction();
			String hql = "update Employees set ssn = :ssn, address= :address where idEmployee = :id";
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			query.setString("ssn", emp.getSsn());
			query.setString("address", emp.getAddress());
			int rowCount = query.executeUpdate();
			System.out.println("Rows affected: "+rowCount);
			tx.commit();
			session.close();
			return rowCount;
		}
	
}
