package com.learnig.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		// In this class we will learn about get() and load()
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = session.load(Student.class, 101);
		System.out.println(student);
		
		Student nStudent = session.get(Student.class, 106);
		System.out.println(nStudent.getAddress());

	}

}
