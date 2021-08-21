package com.how2java.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.how2java.model.Category;
import com.how2java.model.Product;

public class TestHibernateProduct {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Product p = new Product();
		p.setName("iphone7");
		p.setPrice(7000);
		
		Category category = new Category();
		category.setName("case1");
		session.save(category);
		session.save(p);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
