package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory =new Configuration()
						.configure("hibernate.cfg.xml") //() required if name other than hibernate.cfg.xml 
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.addAnnotatedClass(Course.class)
						.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		
		try {
			
			Instructor tempInstructor=new Instructor(
					"ram","kumar","kumarram@gmail.com");
			
			InstructorDetail tempInsDetail= new InstructorDetail
					("http://jaishriram.com","preaching");
			
			tempInstructor.setInstructorDetail(tempInsDetail);
			
			session.beginTransaction();
			
			session.save(tempInstructor);
			System.out.println("Instructor saved: "+tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
