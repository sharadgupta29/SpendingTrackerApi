package com.nocompany.spendingtracker.SpendingTracker.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;

@Repository
public class CategoryRepository {
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	public Category saveCategory(Category category) {
		
		em.persist(category);
		return category;
	}
	

}
