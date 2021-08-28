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
	
}
