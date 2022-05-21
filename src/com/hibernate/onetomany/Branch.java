package com.hibernate.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch_onetomany")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long branchId;
	@Column
	private String code;
	@Column
	private String city;
	@Column
	private String status;
	
	
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", code=" + code + ", city=" + city + ", status=" + status + "]";
	}

	
	
	
}
