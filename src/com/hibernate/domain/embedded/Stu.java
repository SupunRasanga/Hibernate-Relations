package com.hibernate.domain.embedded;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu_tbl")
public class Stu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	private String contactNo;
	private Date dob;
	//private String name;
	//Student's FullName
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "initials", column = @Column(name="stu_initial_name")),
		@AttributeOverride(name = "firstName", column = @Column(name="stu_last_name")),
		@AttributeOverride(name = "lastName", column = @Column(name="stu_first_name"))
	})
	private FullName fullName;
	
	
	//Parent's FullName
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "initials", column = @Column(name="parent_initial_name")),
		@AttributeOverride(name = "firstName", column = @Column(name="parent_last_name")),
		@AttributeOverride(name = "lastName", column = @Column(name="parent_first_name"))
	})
	private FullName parentName;
	
	
	public Stu(String contactNo, Date dob, FullName fullName, FullName parentName) {
		super();
		this.contactNo = contactNo;
		this.dob = dob;
		this.fullName = fullName;
		this.parentName = parentName;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public FullName getFullName() {
		return fullName;
	}
	public void setName(FullName fullName) {
		this.fullName = fullName;
	}

	public FullName getParentName() {
		return parentName;
	}

	public void setParentName(FullName parentName) {
		this.parentName = parentName;
	}
	
}
