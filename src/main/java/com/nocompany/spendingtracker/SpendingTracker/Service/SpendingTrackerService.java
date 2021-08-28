package com.nocompany.spendingtracker.SpendingTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;
import com.nocompany.spendingtracker.SpendingTracker.Repository.CategoryRepository;

@Service
public class SpendingTrackerService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	public Category addCategory(String categoryName) {
		
		Category category= new Category(categoryName);
		return categoryRepository.saveCategory(category);
		
	}


	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
	
	
	
}
