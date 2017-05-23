package com.honeywell.corpo.executor;

import java.util.List;

import com.honeywell.corpo.dataacces.accesor.ClientDAO;
import com.honeywell.corpo.dataacces.accesor.ProductDAO;
import com.honeywell.corpo.dataaccess.entity.Client;
import com.honeywell.corpo.dataaccess.entity.Product;

public class App {

	public static void main(String[] args) {

		ProductDAO pdao = new ProductDAO();
		Product pr = new Product("Chanclas innovadoras");
		pdao.addProduct(pr);
		pr = new Product("Ultimate Mobile Mod.99");
		pdao.addProduct(pr);
		pr = new Product("Second hand notebook");
		pdao.addProduct(pr);
		
		/*
		ClientDAO cdao = new ClientDAO();
		//Good insertion code
		 
		Client cl = new Client("2026", "Pierrot", "Bonafe", 61);
		
		cdao.addClient(cl);
		
		cl = new Client("2027", "Jose", "Sanchez", 31);
		cdao.addClient(cl);
		
		cl = new Client("2028", "Margara", "Mina", 33);
		cdao.addClient(cl);
		 
		List<Client> clLst = cdao.getClients();
		System.out.println("Current clients...");
		int c=0;
		for (Client cli: clLst){
			System.out.println("Client"+ c++ + " " + cli.getFname() + " " + cli.getLname() );
		}
		//Good deletion code
		
		int delRec = cdao.deleteClient("2021");
		System.out.println("Deleted records "+delRec);
		
		
		//Good updating code
		Client cl = new Client("2026", "Argelia", "Mercado", 41);
		cdao.updateClient("2026", cl);
		c=0;
		clLst = cdao.getClients();
		for (Client cli: clLst){
			System.out.println("Client"+ c++ + " " + cli.getFname() + " " + cli.getLname() );
		}
		*/
		
	}

}
