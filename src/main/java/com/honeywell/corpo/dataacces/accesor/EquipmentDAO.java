package com.honeywell.corpo.dataacces.accesor;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.honeywell.corpo.dataaccess.entity.Equipment;

public class EquipmentDAO {

	public void addEquipment(Equipment eq){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(eq);
		tx.commit();
		session.close();
	}
	
	public List<Equipment> getEquiments(){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Equipment");
		List<Equipment> eqs = query.list();
		session.close();
		return eqs;
	}
	
	public int deleteEquipment(int ideq){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Equipment where idEquipment = :ideq";
		Query query = session.createQuery(hql);
		query.setParameter("ideq", ideq);
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows:"+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
	
	public int updateEquipment(int ideq, Equipment eq){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		String hql = "update Equipment set idemployee = :idemployee, description = :description, currentprice= :currentprice where idEquipment = :ideq";
		Query query = session.createQuery(hql);
		query.setParameter("ideq", ideq);
		query.setParameter("idemployee", eq.getEmployee().getIdemployee());
		query.setParameter("description", eq.getDescription());
		query.setParameter("currentprice", eq.getCurrentPrice());
		int rowCount = query.executeUpdate();
		System.out.println("Affected rows:"+rowCount);
		tx.commit();
		session.close();
		
		return rowCount;
	}
}
