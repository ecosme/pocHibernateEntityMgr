package com.honeywell.corpo.dataacces.accesor;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.honeywell.corpo.dataaccess.entity.Client;

public class ClientDAO {

	public void addClient(Client cl){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(cl);
		tx.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> getClients(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Client");
		List<Client> clients = query.list();
		session.close();
		
		return clients;
	}
	
	public int deleteClient(String id){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Client where idClient = :id";
		Query query =session.createQuery(hql);
		query.setParameter("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows: "+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
	
	public int updateClient(String id, Client cl){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "update Client set fname= :fname, lname=:lname, age=:age where idclient = :id";
		Query query =session.createQuery(hql);
		query.setParameter("id", id);
		query.setParameter("fname", cl.getFname());
		query.setParameter("lname", cl.getLname());
		query.setParameter("age", cl.getAge());
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows: "+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
}
