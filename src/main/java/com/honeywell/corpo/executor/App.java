package com.honeywell.corpo.executor;

import java.util.ArrayList;
import java.util.List;

import com.honeywell.corpo.dataacces.accesor.ClientDAO;
import com.honeywell.corpo.dataacces.accesor.EmployeeDAO;
import com.honeywell.corpo.dataacces.accesor.EquipmentDAO;
import com.honeywell.corpo.dataacces.accesor.ProductDAO;
import com.honeywell.corpo.dataacces.accesor.StoreDAO;
import com.honeywell.corpo.dataaccess.entity.Client;
import com.honeywell.corpo.dataaccess.entity.Equipment;
import com.honeywell.corpo.dataaccess.entity.Product;
import com.honeywell.corpo.dataaccess.entity.Store;
import com.honeywell.corpo.model.Employee;

public class App {

	public static void main(String[] args) {

		
		/*
		//Getting info from equipment using scalar functions and hql
		EquipmentDAO eqdao = new EquipmentDAO();
		Number res=eqdao.getEquipmentPrices("avg");
		System.out.println("Equipment average: "+res);
		res=eqdao.getEquipmentPrices("max");
		System.out.println("Equipment max price: "+res);
		res=eqdao.getEquipmentPrices("count");
		System.out.println("Equipments availables: "+res);
		
		 
		//Getting info from equipment
		EquipmentDAO eqdao = new EquipmentDAO();
		List<Equipment> eqLst = eqdao.getEquipments();
		System.out.println("Listing all available equipments...");
		for (Equipment eqq : eqLst){
			System.out.println(eqq);
		}
		
		eqLst = eqdao.getEquipments(2,4);
		System.out.println("-----\nListing from second to fourth available equipments...");
		for (Equipment eqq : eqLst){
			System.out.println(eqq);
		}
		
		//OneToMany Insertion 
		
		Equipment eqNw = new Equipment("Air pilot equipment", 2322.12);
		EquipmentDAO eqdao = new EquipmentDAO();
		EmployeeDAO empdao = new EmployeeDAO(); 
		List<Equipment> tEq = eqdao.getEquiments();
		Equipment eq = tEq.get(2);
		eqdao.addEquipment(eqNw);
		Employee emp = new Employee("Nestor", "Zuri", "3333-22", "xyz");
		
		empdao.addEmployee(emp);
		eqNw.setEmployee(emp);
		eqdao.updateEquipment(eqNw.getIdEquipment(), eqNw);
		emp = new Employee("Andrea", "Huerta", "4433-12", "yys", tEq);
		empdao.addEmployee(emp);
		eq.setEmployee(emp);
		eqdao.updateEquipment(eq.getIdEquipment(), eq);
		
		
		Store st = new Store("Second Ave. 6262",9,12, 122);
		StoreDAO sdao = new StoreDAO();
		sdao.addStore(st);
		
		ProductDAO pdao = new ProductDAO();
		Product pr = new Product("Chanclas innovadoras");
		pdao.addProduct(pr);
		pr = new Product("Ultimate Mobile Mod.99");
		pdao.addProduct(pr);
		pr = new Product("Second hand notebook");
		pdao.addProduct(pr);
		
		
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
