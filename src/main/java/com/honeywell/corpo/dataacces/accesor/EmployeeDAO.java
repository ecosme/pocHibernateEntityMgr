package com.honeywell.corpo.dataacces.accesor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.honeywell.corpo.model.Employee;

public class EmployeeDAO {

	public void addEmployee(Employee emp){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}
	
	public List<Employee> getEmployees(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Employee");
		List<Employee> emps = query.list();
		session.close();
		return emps;
	}
	
	public int deleteEmployee(int idem){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Employee where idEmployee = :idem";
		Query query = session.createQuery(hql);
		query.setParameter("idem", idem);
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows:"+rowCount);
		tx.commit();
		session.close();
		return rowCount;
	}
	
	public int updateEmployee(int idem, Employee emp){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "update Employee set fName= :fName, lName=:lName, position=:position where idEmployee = :idem";
		Query query = session.createQuery(hql);
		query.setParameter("idem", idem);
		query.setParameter("fName", emp.getfName());
		query.setParameter("lName", emp.getlName());
		query.setParameter("position", emp.getPosition());
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows:"+rowCount);
		tx.commit();
		session.close();
		return rowCount;
	}
	
}
