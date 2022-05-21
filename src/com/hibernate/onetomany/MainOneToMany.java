package com.hibernate.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainOneToMany {
	public static void main(String[] args) {
		Banks boc = new Banks();
		boc.setCode("BOC");
		boc.setDescription("Welcome to Bank of Cylone");
		boc.setStatus("Active");
		
		Branch branch1 = new Branch();
		branch1.setCity("Negombo");
		branch1.setCode("BOC_N");
		branch1.setStatus("Active");
		
		Branch branch2 = new Branch();
		branch2.setCity("Colombo");
		branch2.setCode("BOC_C");
		branch2.setStatus("Active");
		
		boc.getBranches().add(branch1);
		boc.getBranches().add(branch2);
		
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(branch1);
		session.save(branch2);
		session.save(boc);
		session.getTransaction().commit();
		session.close();
		
	}
}
