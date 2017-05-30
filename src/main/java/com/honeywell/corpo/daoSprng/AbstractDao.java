package com.honeywell.corpo.daoSprng;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;

public abstract class AbstractDao <PK extends Serializable, T>{

	private final Class<T> persistenceClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistenceClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;
}
