package com.hibernate.manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "class_manytoone")
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long classId;
	@Column
	private String className;
	@Column
	private String location;
	@Column
	private String subject;
	@ManyToOne
	private Students student;
	
	public long getClassId() {
		return classId;
	}
	public void setClassId(long classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Class [classId=" + classId + ", className=" + className + ", location=" + location + ", subject="
				+ subject + ", student=" + student + "]";
	}
	
}
