package com.hibernate.manytoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Student;

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
		
		student1.getClas().add(class1);
		student1.getClas().add(class2);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student1);
		session.save(class1);
		session.save(class2);
		
		//Read Data 
//		Students b = session.get(Students.class, 1L);
//		System.out.println(b.getStudentName());
//		System.out.println(b.getAge());
//		System.out.println(b.getAddress());
//		System.out.println(b.getDob());
//		
//		Class c1 = session.get(Class.class, 2L);
//		System.out.println(c1.getClassName());
//		System.out.println(c1.getLocation());
//		System.out.println(c1.getSubject());
//		
//		
//		Class c2 = session.get(Class.class, 3L);
//		System.out.println(c2.getClassName());
//		System.out.println(c2.getLocation());
//		System.out.println(c2.getSubject());
//		
		//Read Data
		Students s = session.get(Students.class, 1L);
		System.out.println("Student is = "+s.getClas());
		
		Class c1 = session.get(Class.class, 2L);
		System.out.println("Class1 is = "+c1);
		
		Class c2 = session.get(Class.class, 3L);
		System.out.println("Class1 is = "+c2);
		
		session.getTransaction().commit();
		session.close();
	}
}
