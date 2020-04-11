package com.luv2code.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
		//anotate the class as an entity and map to db	
	
		//define the feilds
		
		//annotate the fields with db column names
		
		//create constructors
		
		//generate getter/setter methods
		
		//generate toString()
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY) //autoIncrement
	private int id;
	@Column(name="youtube_channel")
	private String yChannel;
	@Column
	private String hobby;
	//adding new field for Instructor
	
/*	//this deletes Instructor and Instructor Details
	@OneToOne(mappedBy="instructorDetail",cascade=CascadeType.ALL)
*/
	//this deletes only Instructor Details
	@OneToOne(mappedBy="instructorDetail",cascade= {CascadeType.DETACH,
								CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	
	private Instructor instructor;
	public InstructorDetail(String yChannel, String hobby) {
		this.yChannel = yChannel;
		this.hobby = hobby;
	}
	
	public InstructorDetail() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getyChannel() {
		return yChannel;
	}

	public void setyChannel(String yChannel) {
		this.yChannel = yChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", yChannel=" + yChannel + ", hobby=" + hobby + "]";
	}
	

}
