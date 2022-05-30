package com.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class MainManyToMany {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.setDriver("Nimal");
		bus1.setRoot("Galle");
		bus1.setYear("2013");
		
		Bus bus2 = new Bus();
		bus2.setDriver("Nimal");
		bus2.setRoot("Galle");
		bus2.setYear("2013");
		
		Passenger passenger1 = new Passenger();
		passenger1.setName("Sunil");
		passenger1.setLocation("Colombo");
		passenger1.setAge(25);
		
		Passenger passenger2 = new Passenger();
		passenger2.setName("Sunil");
		passenger2.setLocation("Colombo");
		passenger2.setAge(25);
		
		bus1.getPassenger().add(passenger1);
		bus2.getPassenger().add(passenger1);
		bus1.getPassenger().add(passenger2);
		bus2.getPassenger().add(passenger2);
		
		passenger1.getBus().add(bus1);
		passenger1.getBus().add(bus2);
		passenger2.getBus().add(bus1);
		passenger2.getBus().add(bus2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//Cascade Type Enabled - All
		//session.save(bus1);session.save(bus2);
		
		//session.save(passenger1);
		//session.save(passenger2);
		
		Bus bus = session.get(Bus.class, 1L);
		System.out.println(bus.getPassenger().size());
		
//		
//		List<Passenger> passenger = Bus.getPassenger();
//		for(Passenger passenger : Pass) {
//			System.out.println(passenger.getBus());
//		}
		
		
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
