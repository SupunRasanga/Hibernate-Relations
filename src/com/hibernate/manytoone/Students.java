package com.hibernate.manytoone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_manytoone")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long studentId;
	@Column
	private String studentName;
	@Column
	private Date dob;
	@Column
	private String address;
	@Column
	private String age;
	@OneToMany(mappedBy = "student")
	private List<Class> clas = new ArrayList<Class>();
	
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Class> getClas() {
		return clas;
	}

	public void setClas(List<Class> clas) {
		this.clas = clas;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + ", address="
				+ address + ", age=" + age + "]";
	}
	
	

}
