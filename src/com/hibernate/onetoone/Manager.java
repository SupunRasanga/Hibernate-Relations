package com.hibernate.onetoone;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Manager_onetoone")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long managerId;
	@Column
	private String name;
	@Column
	private String contactNo;
	@Column
	private Date bod;
	@OneToOne
	@JoinColumn(name = "bankId")
	private Bank bank;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Date getBod() {
		return bod;
	}
	public void setBod(Date bod) {
		this.bod = bod;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", contactNo=" + contactNo + ", bod=" + bod
				+ ", bank=" + bank + "]";
	}
	
	
	
}
