package com.honeywell.corpo.dataacces.accesor;

import org.hibernate.query.Query;

import com.honeywell.corpo.dataaccess.entity.Equipment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;




public class EquipmentDAO {

	public void addEquipment(Equipment eq){
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(eq);
		tx.commit();
		session.close();
	}
	
	public List<Equipment> getEquipments(){
		return getEquipments(0,0);
		
	}
	
	public List<Equipment> getEquipments(int firstRecs, int maxRecs){
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Equipment e order by e.description");
		if ((firstRecs > 0) && (maxRecs > 0)){
			query.setFirstResult(firstRecs);
			query.setMaxResults(maxRecs);
		}
		List<Equipment> eqs = query.list();
		session.close();
		return eqs;
	}
	
	public Number getEquipmentPrices(String category){
		Session session = SessionUtil.getSession();
		String criteria="";
		switch (category.toLowerCase()){
			case "avg":
				criteria = "select avg(e.currentPrice) ";
				break;
			case "count":
				criteria = "select count(1) ";
				break;
			case "max":
				criteria = "select max(e.currentPrice) ";
				break;
			case "min":
				criteria = "select min(e.currentPrice) ";
				break;
			case "sum":
				criteria = "select sum(e.currentPrice) ";
				break;
		}
		Query query = session.createQuery(criteria + " from Equipment e");
		
		return (Number) query.uniqueResult();
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
