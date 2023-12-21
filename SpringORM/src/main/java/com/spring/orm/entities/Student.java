package com.spring.orm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="student_details")
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;

	@Column(name="name")
	private String studentName;

	@Column(name="city")
	private String studentCityString;

	public Student(int studentId, String studentName, String studentCityString) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCityString = studentCityString;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCityString() {
		return studentCityString;
	}

	public void setStudentCityString(String studentCityString) {
		this.studentCityString = studentCityString;
	}

}
