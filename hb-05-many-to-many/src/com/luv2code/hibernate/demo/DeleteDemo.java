package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			int id=1;//ID should be pre known
			session.beginTransaction();
			Instructor tempIns=session.get(Instructor.class, id);
			System.out.println("recived Instructor:"+tempIns);
			if(tempIns!=null) {
				System.out.println("deleting :"+tempIns);
				session.delete(tempIns);
				session.getTransaction().commit();
			}
		}
		finally {
			factory.close();
		}
	}
}
