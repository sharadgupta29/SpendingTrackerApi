package com.nocompany.spendingtracker.SpendingTracker.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;

@Repository
@Transactional
public class CategoryRepository {
	
	@PersistenceContext
	EntityManager em;

	
	public Category saveCategory(Category category) {
		em.persist(category);
		return category;
	}
	
	public List<Category> findAll(){
		TypedQuery<Category> query=em.createQuery("select c from Category c",Category.class);
		List<Category> resultList=query.getResultList();
		return resultList;
	}
	
	public Category findById(Long id){
		Category category=em.find(Category.class, id);
		return category;
	}

	public Category findByName(String categoryName){
		TypedQuery<Category> query=em.createQuery("select c from Category c where c.name=:cName",Category.class);
		query.setParameter("cName", categoryName);
		return query.getSingleResult();
	}
	
	public List<Category> findCategoryHavingExpense(){
		TypedQuery<Category> query=em.createQuery("select c from Category c JOIN c.expenses e",Category.class);
		return query.getResultList();
	}
	
	public List<Category> findCategoryWithNameLike(String like){
		
		//1st  create criteriaQuery object using criteria builder
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Category> cq = cb.createQuery(Category.class);
		
		//2nd 
		Root<Category> categoryRoot= cq.from(Category.class);
		
		//3rd
		Predicate nameLike = cb.like(categoryRoot.get("name"), "%"+like+"%");
		
		//4th
		cq.where(nameLike);
		
		//5th step
		TypedQuery<Category> query=em.createQuery(cq.select(categoryRoot));
		
		return query.getResultList();
	}
	
}































