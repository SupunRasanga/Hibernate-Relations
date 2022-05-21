package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bank_onetomany")
public class Banks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long bankId;
	@Column
	private String code;
	@Column
	private String description;
	@Column
	private String status;
	@OneToMany
	//@JoinColumn(name = "branchId")
	private List<Branch> branches = new ArrayList<Branch>();
	
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
		return "Bank [bankId=" + bankId + ", code=" + code + ", description=" + description + ", status=" + status
				+ "]";
	}
	
	
}
