package com.example.country.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="studentname")
    private String studentname;
	
	@Column(name="course")
    private String course;
	
	@Column(name="fee")
    private int fee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	public Student() {
	
	}
	public Student(int id, String studentname, String course, int fee) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}
	
	
    
    
}
