package com.hibernate.manytoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainManyToOne {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.setStudentName("Supun Rasanga");
		student1.setDob(new Date());
		student1.setAge("22");
		student1.setAddress("Negombo");
		
		
		
		Class class1 = new Class();
		class1.setClassName("12-C");
		class1.setLocation("Minuwangoda");
		class1.setSubject("Java");
		class1.setStudent(student1);
		
		Class class2 = new Class();
		class2.setClassName("13-C");
		class2.setLocation("Kandy");
		class2.setSubject("Python");
		class2.setStudent(student1);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student1);
		session.save(class1);
		session.save(class2);
		session.getTransaction().commit();
		session.close();
	}
}
