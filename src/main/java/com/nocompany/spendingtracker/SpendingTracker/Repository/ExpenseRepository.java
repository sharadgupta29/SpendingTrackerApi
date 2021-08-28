package com.nocompany.spendingtracker.SpendingTracker.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Expense;

@Repository
@Transactional
public class ExpenseRepository {
	
	@PersistenceContext
	EntityManager em;
	
	public Expense saveExpense(Expense expense) {
		em.persist(expense);
		return expense;
	}
	
	public List<Expense> findAll(){
		TypedQuery<Expense> query=em.createNamedQuery("find_all_expense",Expense.class);
		List<Expense> resultList=query.getResultList();
		return resultList;
	}
	
	public Expense findById(Long id){
		Expense expense=em.find(Expense.class, id);
		return expense;
	}


	
}
