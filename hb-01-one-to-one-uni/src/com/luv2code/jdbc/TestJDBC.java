package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			System.out.println("connecting to DB:"+jdbcUrl);
			Connection myCon=DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("connected to DB");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
