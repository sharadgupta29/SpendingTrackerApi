package com.nocompany.spendingtracker.SpendingTracker.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;
import com.nocompany.spendingtracker.SpendingTracker.Entity.Expense;
import com.nocompany.spendingtracker.SpendingTracker.Repository.CategoryRepository;
import com.nocompany.spendingtracker.SpendingTracker.Repository.ExpenseRepository;

@Service
public class SpendingTrackerService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	public Category addCategory(String categoryName) {
		
		Category category= new Category(categoryName);
		return categoryRepository.saveCategory(category);
		
	}


	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}


	public Category updateCategoryById(Long categoryId, String categoryUpdatedName) {
		Category category=categoryRepository.findById(categoryId);
		if(category!=null) {
			category.setName(categoryUpdatedName);
			categoryRepository.saveCategory(category);
		}
		return category;
	}


	public List<Expense> getAllExpenses() {
		return expenseRepository.findAll();
	}


	public Expense addExpenseWithCategory(String categoryName, Double expenseAmount, Date purchaseDate) {
		
		Category category=categoryRepository.findByName(categoryName);
		Expense expense = new Expense(expenseAmount,purchaseDate);
		expense.setCategory(category);
		return expenseRepository.saveExpense(expense);
	}


	public List<Category> getCategoryHavingExpense() {
		return categoryRepository.findCategoryHavingExpense();
	}	
}
