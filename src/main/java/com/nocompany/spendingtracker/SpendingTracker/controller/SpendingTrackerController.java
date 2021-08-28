package com.nocompany.spendingtracker.SpendingTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;
import com.nocompany.spendingtracker.SpendingTracker.Entity.Expense;
import com.nocompany.spendingtracker.SpendingTracker.Service.SpendingTrackerService;

@RestController
public class SpendingTrackerController {
	
	@Autowired
	SpendingTrackerService stService;
	
	//Test Connection with server
	@GetMapping("/ping")
	public String pingServer() {
		return "Hi.. you are in Spending Tracker Backend";
		
	}
	//Basic example of Insert with JPA
	@GetMapping("/addCategory")
	public Category addCategory(@RequestParam(value="name") String categoryName) {
		return stService.addCategory(categoryName);
	}
	
	//Basic example of JPQL
	@GetMapping("/getAllCategories")
	public List<Category> getAllCategories() {
		return stService.getAllCategories();
	}
	
	//Update categoryById - http://localhost:8080/updateCategoryById?id=1002&updatedName=Jaggery
	@GetMapping("/updateCategoryById")
	public Category updateCategoryById(@RequestParam(value="id") Long categoryId, @RequestParam(value="updatedName") String categoryUpdatedName) {
		return stService.updateCategoryById(categoryId,categoryUpdatedName);
	}
	
	//Basic example of JPQL
		@GetMapping("/getAllExpenses")
		public List<Expense> getAllExpenses() {
			return stService.getAllExpenses();
		}
}
