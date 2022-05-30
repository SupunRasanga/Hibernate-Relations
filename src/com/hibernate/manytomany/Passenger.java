package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long passengerId;
	@Column
	private String Name;
	@Column
	private String location;
	@Column
	private int age;
	@ManyToMany
	@JoinTable(
				name = "bus_passenger" ,
				joinColumns = @JoinColumn(name="passenger_id"),
				inverseJoinColumns = @JoinColumn(name="bus_id")
			)
			
	private List<Bus> bus = new ArrayList();
	
	
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	public long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", Name=" + Name + ", location=" + location + ", age=" + age
				+ "]";
	}
	
	
}
