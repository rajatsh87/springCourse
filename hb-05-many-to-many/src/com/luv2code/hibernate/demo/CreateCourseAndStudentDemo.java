package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Student st1=new Student("rahu","sahu","rajatsh87@gmail.com");
			Course  cr1=new Course("fifa 1922");
			//Course  cr2=new Course("fifa 1923");
			System.out.println("saving course:"+cr1);
			//System.out.println("saving course:"+cr2);
			session.save(cr1);
			//session.save(cr2);
			cr1.addStudent(st1);
			//cr2.addStudent(st1);
			System.out.println("saving student:"+st1);
			session.save(st1);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}
}
