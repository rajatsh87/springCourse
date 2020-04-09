package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory =new Configuration()
						.configure("hibernate.cfg.xml") //() required if name other than hibernate.cfg.xml 
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		
		try {
			//Method 1
			
//			int Id=1;// Id should be known
//			session.beginTransaction();
//			Student st=session.get(Student.class, Id);
//			session.delete(st);
//			System.out.println("deleted student:"+st);
//			session.getTransaction().commit();
//			System.out.println("done!");
			
			//Method 2
			session=factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete from Student where id=6").executeUpdate();
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
