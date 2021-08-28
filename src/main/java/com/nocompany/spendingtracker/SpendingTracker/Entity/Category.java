package com.nocompany.spendingtracker.SpendingTracker.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@CreationTimestamp
	private LocalDateTime addDateTime;
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	
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

	
	
	public LocalDateTime getAddDateTime() {
		return addDateTime;
	}


	public void setAddDateTime(LocalDateTime addDateTime) {
		this.addDateTime = addDateTime;
	}


	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}


	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
