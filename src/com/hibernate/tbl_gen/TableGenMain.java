package com.hibernate.tbl_gen;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Animal;
import com.hibernate.domain.Cars;


public class TableGenMain {
	public static void main(String[] args) {
		
		Cars car = new Cars();
		car.setMake("Honda");
		car.setModel("Vissel");
		
		Animal animal = new Animal();
		animal.setName("Tommy");
		animal.setAge(8);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(car);
		session.save(animal);
		
		session.getTransaction().commit();
		session.close();
		
	}
}
