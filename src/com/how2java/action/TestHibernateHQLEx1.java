package com.how2java.action;

import java.util.List;

import javax.persistence.TemporalType;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;

import com.how2java.model.Product;

public class TestHibernateHQLEx1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		String hql = "from Product p where p.name like :name ";
		Query<Product> query1 = session.createQuery(hql,Product.class);
		query1.setParameter("name", "%iphone%");
		List<Product> list = query1.list();
		list.forEach(s->System.out.println(s.getName()));
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
