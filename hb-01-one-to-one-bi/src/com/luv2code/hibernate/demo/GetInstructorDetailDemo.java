package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {
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
			Instructor tempIns=tempInsDetail.getInstructor();
			System.out.println("Instructor details:"+tempIns);
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
