package com.how2java.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.how2java.model.Product;

public class TestHibernateCriteriaEx1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		System.out.println("哇哈哈");
		session.createSQLQuery("");
		session.getTransaction().commit();	
		factory.close();
		
	}

}
