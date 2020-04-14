package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateCourseAndReviewsDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.addAnnotatedClass(Course.class)
						.addAnnotatedClass(Review.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			
			Course tempCourse=new Course("this is a demo course");
			tempCourse.addReview(new Review("dummy courses are nice"));
			tempCourse.addReview(new Review("well done"));
			tempCourse.addReview(new Review("mapping is tuff to understand"));
			session.beginTransaction();
			session.save(tempCourse);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			
			factory.close();
		}
	}
}
