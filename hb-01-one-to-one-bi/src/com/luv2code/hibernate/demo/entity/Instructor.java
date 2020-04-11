package com.luv2code.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;  
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {

	//anotate the class as an entity and map to db	
	
	//define the feilds

	//annotate the fields with db column names
			
	//create constructors
			
	//generate getter/setter methods
	
	//**one to one mapping**
			
	//generate toString()
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id")
	private InstructorDetail instructorDetail;
	
	public Instructor() {
		
	}

	public Instructor(String first_name, String last_name, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInsreuctorDetail() {
		return instructorDetail;
	}

	public void setInsreuctorDetail(InstructorDetail insreuctorDetail) {
		this.instructorDetail = insreuctorDetail;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", insreuctorDetail=" + instructorDetail+ "]";
	}

	
	
}
