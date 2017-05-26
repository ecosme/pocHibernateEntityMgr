package com.honeywell.corpo.dataacces.accesor;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.honeywell.corpo.dataaccess.entity.Store;

public class StoreDAO {

	@SuppressWarnings("deprecation")
	public void addStore(Store st){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Creating store");
		try{
			session.save(st);
			System.out.println("Store updated");
			tx.commit();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		session.close();
	}
	
	public List<Store> getStores(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Store");
		List<Store> sts = query.list();
		session.close();
		
		return sts;
	}
	
	public int deleteStore(int id){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Store where idStore = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows: "+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
}
