package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Employee;

public class App 
{
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction transaction=session.beginTransaction();
	
		Employee emp=new Employee();
		
		emp.setName("suna");
		emp.setDept("tester");
		
		//object is sending to database(persist state)-> It can a row in the database
		session.save(emp);
		transaction.commit();
		
		
		
	}

}
