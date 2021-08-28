package com.nocompany.spendingtracker.SpendingTracker.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Category(String name) {
		super();
		this.name = name;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
