package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory =new Configuration()
						.configure("hibernate.cfg.xml") //() required if name other than hibernate.cfg.xml 
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		
		Session session =factory.getCurrentSession();
		
		try {
			Student tempStudent=new Student("pauli","walli","pali@gmail.com");
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("saving done!");
			//in fetching data we require student ID
			int Id=tempStudent.getId();
			session=factory.getCurrentSession();
			session.beginTransaction();
			Student rec=session.get(Student.class,Id);
			System.out.println("Student recived:"+rec.toString());
			session.getTransaction().commit();
			System.out.println("reciving Done!");
		}
		finally {
			factory.close();
		}
	}

}
