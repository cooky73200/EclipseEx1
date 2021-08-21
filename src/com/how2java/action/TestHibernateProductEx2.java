package com.how2java.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.how2java.model.Product;

public class TestHibernateProductEx2 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		
		for (int i = 0; i <=100; i++) {
			Product product = new Product();
			product.setName("iphone"+i);
			product.setPrice(i);
			session.save(product);
		}
		
		
		session.getTransaction().commit();
		
		factory.close();
		
		
	}

}
