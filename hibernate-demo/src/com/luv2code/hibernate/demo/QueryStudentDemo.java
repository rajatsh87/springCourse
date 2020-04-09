package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;



public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.buildSessionFactory();

		Session session =factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			
			//query students
			List<Student> theStudents=session.createQuery("from Student").getResultList(); //first letter of table should be in captial
			
			//displayStudent(theStudents);
			
			//student last name:walli
			//theStudents=session.createQuery("from Student s where s.lastName='%wall%'").getResultList();
			
			//displayStudent(theStudents);
			//student lastName="shadev" or firstName="arjun"
//			theStudents=session.createQuery("from Student s where s.lastName='shadev' OR s.firstName='arjun'").list();
//			displayStudent(theStudents);
			
			//student email=...gmail.com
			theStudents=session.createQuery("from Student s where s.email LIKE '%.com'").getResultList();
			displayStudent(theStudents);
			session.getTransaction();
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudent(List<Student> theStudents) {
		for(Student st:theStudents) {
			System.out.println(st);
		}
	}

}
