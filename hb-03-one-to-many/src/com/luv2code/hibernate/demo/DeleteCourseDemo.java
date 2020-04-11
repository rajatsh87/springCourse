package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteCourseDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.addAnnotatedClass(Course.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			int id=11;//ID should be pre known
			session.beginTransaction();
			Course tempCourse=session.get(Course.class, id);
			
			System.out.println("deleting:"+tempCourse);
			//deleting using query
			//session.createQuery("delete from Course where instructor_id=1");
			session.delete(tempCourse);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
