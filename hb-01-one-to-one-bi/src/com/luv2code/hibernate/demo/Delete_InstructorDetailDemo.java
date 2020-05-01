package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class Delete_InstructorDetailDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			int id=2;
			session.beginTransaction();
			InstructorDetail tempInsDetail=session.get(InstructorDetail.class, id);
			System.out.println("recived Instrctor Detail:"+tempInsDetail);
			if(tempInsDetail!=null) {
				System.out.println("deleteing:"+tempInsDetail);
				session.delete(tempInsDetail);
			}
			session.getTransaction().commit();
			System.out.println("Done!");
			
			/*
			//deleting using query
			Session session=sessionFactory.getCurrentSession();
			Query theQuery=session.createQuery("delete from Customer where id=:customerId");
			theQuery.setParameter("customerId", c1);
			theQuery.executeUpdate();
			*/
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
