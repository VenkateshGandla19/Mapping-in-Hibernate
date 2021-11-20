package com.hibernate.MappingTechniques.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int laptopId;
	private String laptopName;
	@ManyToOne
	private Student student;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
