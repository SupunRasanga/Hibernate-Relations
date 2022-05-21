package com.hibernate.onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainOneToOne {
	public static void main(String[] args) {
		Bank sampathBank = new Bank();
		sampathBank.setCode("SMP");
		sampathBank.setName("Sampath Bank");
		sampathBank.setDescription("Welcome");
		sampathBank.setStatus("Active");
		
		Manager manager = new Manager();
		manager.setBank(sampathBank);
		manager.setBod(new Date());
		manager.setContactNo("0773044121");
		manager.setName("Supun");
		sampathBank.setManager(manager);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(sampathBank);
		session.save(manager);
		
		//Read Data with Hibernate
//		Bank b = session.get(Bank.class, 1L);
//		System.out.println(b.getName());
//		System.out.println(b.getCode());
//		System.out.println(b.getManager().getName());
//		
//		Manager m = session.get(Manager.class, 2L);
//		System.out.println(m.getName());
//		System.out.println(m.getBank().getName());
		
		
		session.getTransaction().commit();
		session.close();
	}
}
