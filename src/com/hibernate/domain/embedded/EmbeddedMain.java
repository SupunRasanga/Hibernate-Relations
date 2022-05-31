package com.hibernate.domain.embedded;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddedMain {
	public static void main(String[] args) {
		FullName fullName = new FullName();
		fullName.setInitials("N.S.");
		fullName.setFirstName("Rasanga");
		fullName.setLastName("De Silva");
		
		FullName parentName = new FullName();
		parentName.setInitials("W.A.M");
		parentName.setFirstName("Nilanthi");
		parentName.setLastName("Fernando");
		
		Stu sahan = new Stu("0773044121",new Date(), fullName, parentName);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(sahan);
		session.getTransaction().commit();
		session.close();
	}
}
