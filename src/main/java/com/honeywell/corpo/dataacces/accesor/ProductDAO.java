package com.honeywell.corpo.dataacces.accesor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.honeywell.corpo.dataaccess.entity.Product;

public class ProductDAO {

	public void addProduct(Product prod){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(prod);
		tx.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts(){
		Session session = SessionUtil.getSession();
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("from Product");
		List<Product> prods = query.list();
		session.close();
		
		return prods;
	}
	
	public int deleteProduct(int id){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Product where idProd = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows: "+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
}
