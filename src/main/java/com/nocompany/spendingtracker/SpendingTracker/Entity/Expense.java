package com.nocompany.spendingtracker.SpendingTracker.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@NamedQuery(name = "find_all_expense", query = "select e from Expense e")
@Entity
public class Expense {

	@Id
	@GeneratedValue
	private Long id;
	private Double amount;
	private Date purchaseDate;
	@CreationTimestamp
	private LocalDateTime addDateTime;
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	@JsonIgnore
	@ManyToOne
	private Category category;
	
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Expense(Double amount, Date purchaseDate) {
		super();
		this.amount = amount;
		this.purchaseDate = purchaseDate;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
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

	
	
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Expense [id=" + id + ", amount=" + amount + ", purchaseDate=" + purchaseDate + ", addDateTime="
				+ addDateTime + ", updateDateTime=" + updateDateTime + "]";
	}
	
	
	
		
}
