package com.hibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_onetoone")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long bankId;
	@Column
	private String code;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String status;
	@OneToOne
	@JoinColumn(name = "managerId")
	private Manager manager;
	
	public long getBankId() {
		return bankId;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", status=" + status + ", manager=" + manager + "]";
	}
	
	
	
	
}
