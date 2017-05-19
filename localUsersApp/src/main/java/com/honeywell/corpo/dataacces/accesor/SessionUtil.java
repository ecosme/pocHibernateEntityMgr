package com.honeywell.corpo.dataacces.accesor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SessionUtil {
	private static SessionUtil instance = new SessionUtil();
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("deprecation")
	private SessionUtil(){
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static Session getSession(){
		Session session = getInstance().sessionFactory.openSession();
		
		return session;
	}
	public static SessionUtil getInstance(){
		return instance;
	}
}
