package com.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "tablegen")
	@TableGenerator(
				name="tablegen",
				allocationSize = 1,
				initialValue = 0,
				pkColumnName = "id_name",
				pkColumnValue = "Animal",
				valueColumnName = "next_id",
				table = "id_gen"
				
	)
	private long animalId;
	private String name;
	private long age;
	
	public long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}

	
}
