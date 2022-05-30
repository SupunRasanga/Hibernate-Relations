package com.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "tablegen")
	@TableGenerator(
				name="tablegen",
				allocationSize = 1,
				initialValue = 0,
				pkColumnName = "id_name",
				pkColumnValue = "Car",
				valueColumnName = "next_id",
				table = "id_gen"
				
	)
	private long carId;
	private String make;
	private String model;
	
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
