package com.honeywell.corpo.executor;

import com.honeywell.corpo.dataacces.accesor.ClientDAO;
import com.honeywell.corpo.dataaccess.entity.Client;

public class App {

	public static void main(String[] args) {
		
		Client cl = new Client("2023", "Pier", "Bonair", 61);
		ClientDAO cdao = new ClientDAO();
		cdao.addClient(cl);


	}

}
