package com.honeywell.corpo.daoSprng;

import java.util.List;

import com.honeywell.corpo.dataaccess.entity.Client;

public interface ClientDAO {
	
	public void addClient(Client cl);
	
	public List<Client> getClients();
	
	public int deleteClient(String id);
	
	public int updateClient(String id, Client cl);
}
