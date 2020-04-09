package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory =new Configuration()
						.configure("hibernate.cfg.xml") //() required if name other than hibernate.cfg.xml 
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		
		try {
			Student tempStudent=new Student("paul","wall","pal@gmail.com");
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("done!");
			//
		}
		finally {
			factory.close();
		}
	}

}
