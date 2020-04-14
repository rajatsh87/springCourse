package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class GetCourseAndReview {

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
			int id=10;
			session.beginTransaction();
			Course course=session.get(Course.class, id);
			List<Review> review=course.getReviews();
			System.out.println("course:"+course);
			System.out.println("review:"+review);
			session.getTransaction().commit();
			
		}	
		finally {
			session.close();
			factory.close();
		}

	}

}
