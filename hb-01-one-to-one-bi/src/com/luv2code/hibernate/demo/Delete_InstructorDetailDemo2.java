package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class Delete_InstructorDetailDemo2 {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			int id=3	;
			session.beginTransaction();
			InstructorDetail tempInsDetail=session.get(InstructorDetail.class, id);
			System.out.println("recived Instrctor Detail:"+tempInsDetail);
			//IMPORTANT LINE 26
			tempInsDetail.getInstructor().setInsreuctorDetail(null);
			if(tempInsDetail!=null) {
				System.out.println("deleteing only details and not Instructor:");
				session.delete(tempInsDetail);
			}
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
