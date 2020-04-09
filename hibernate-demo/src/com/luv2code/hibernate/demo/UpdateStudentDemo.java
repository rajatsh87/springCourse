package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
	
		try {
			int Id=1; //student Id should be known
			
			session.beginTransaction();
			Student st=session.get(Student.class,Id);
			System.out.println(st);
			st.setFirstName("Saurabh");
			st.setLastName("Pal");
			session.getTransaction().commit();//just commiting will update in DB
			System.out.println("new Student:"+st);
			
			//updating all
			session=factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("updating all emails");
			session.createQuery("update Student set email='iamBoss@gmail.com'")
								.executeUpdate();
			session.getTransaction().commit();
			System.out.println("updating done");
		}
		finally {
			session.close();
		}
	}

}
