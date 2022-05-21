package com.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Student;


public class HibernateMain {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setFirstName("Nimal");
		s.setLastName("Perera");
		s.setContactNo("0775678912");
		s.setDob(new Date());
		s.setAddress("Negombo");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		
	}

}
