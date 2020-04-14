package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCourseDemo {

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
			int id=1;
			session.beginTransaction();
			Instructor tempIns=session.get(Instructor.class,id);
			Course c1=new Course("khastriya dharma");
			Course c2=new Course("uddha kala");
			tempIns.add(c1);
			tempIns.add(c2);
			
			//session.persist(tempIns); //insead of save persist will work 
			session.save(c1);
			session.save(c2);
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
