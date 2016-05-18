package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreEmployee {

	public static void main(String[] args) {

		//	1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		// 2
		SessionFactory factory = configuration.buildSessionFactory();
		
		// 3
		Session session = factory.openSession();
		
		// 4
		Transaction tr = session.beginTransaction();
		
		Employee1 emp = new Employee1();
		emp.setFname("Aashu");
		emp.setLname("V");
		
		Employee1 emp2 = new Employee1();
		emp2.setFname("Nehith");
		emp2.setLname("V");
		
		session.persist(emp);	// insert query... saves the data into db employee table
		session.persist(emp2);	// insert query... saves the data into db employee table
		
		tr.commit();
		
		System.out.println("Data is stored...");
		
	}

}
