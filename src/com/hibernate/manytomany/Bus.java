package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long busId;
	@Column
	private String year;
	@Column
	private String driver;
	@Column
	private String root;
	@ManyToMany(mappedBy = "bus", cascade = CascadeType.ALL)
	private List<Passenger> passenger = new ArrayList<Passenger>();
	
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", year=" + year + ", driver=" + driver + ", root=" + root + ", passenger="
				+ passenger + "]";
	}
	
}
