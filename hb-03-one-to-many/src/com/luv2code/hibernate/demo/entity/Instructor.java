// package com.luv2code.hibernate.demo.entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="instructor")
//public class Instructor {
//
//	//anotate the class as an entity and map to db	
//	
//	//define the feilds
//
//	//annotate the fields with db column names
//			
//	//create constructors
//			
//	//generate getter/setter methods
//	
//	//**one to one mapping**
//			
//	//generate toString()
//	
//	@Column
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
//	@Column
//	private String first_name;
//	@Column
//	private String last_name;
//	@Column
//	private String email;
//	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="instructor_detail_id")
//	private InstructorDetail insreuctorDetail;
//	
//	@OneToMany(mappedBy="instructor",
//			cascade= {CascadeType.DETACH,CascadeType.MERGE,
//			CascadeType.PERSIST,CascadeType.REFRESH})
//	private List<Course> courses;
//	public Instructor() {
//		
//	}
//
//	public Instructor(String first_name, String last_name, String email) {
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.email = email;
//	}
//
//	public List<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getFirst_name() {
//		return first_name;
//	}
//
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//
//	public String getLast_name() {
//		return last_name;
//	}
//
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public InstructorDetail getInsreuctorDetail() {
//		return insreuctorDetail;
//	}
//
//	public void setInsreuctorDetail(InstructorDetail insreuctorDetail) {
//		this.insreuctorDetail = insreuctorDetail;
//	}
//
//	@Override
//	public String toString() {
//		return "Instructor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
//				+ ", insreuctorDetail=" + insreuctorDetail + "]";
//	}
//	
//	public void add(Course tempCourse) {
//		if(courses==null) {
//			courses=new ArrayList<>();
//		}
//		courses.add(tempCourse);
//		tempCourse.setInstructor(this);
//	}
//
//	
//	
//}




package com.luv2code.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {

	// annotate the class as an entity and map to db table
	
	// define the fields
	
	// annotate the fields with db column names
	
	// ** set up mapping to InstructorDetail entity
	
	// create constructors
	
	// generate getter/setter methods
	
	// generate toString() method

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id")
	private InstructorDetail instructorDetail;
	
	@OneToMany(mappedBy="instructor",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<Course> courses;
	
	
	public Instructor() {
		
	}

	public Instructor(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + "]";
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	// add convenience methods for bi-directional relationship
	
	public void add(Course tempCourse) {
		
		if (courses == null) {
			courses = new ArrayList<>();
		}
		
		courses.add(tempCourse);
		
		tempCourse.setInstructor(this);
	}
	
}











