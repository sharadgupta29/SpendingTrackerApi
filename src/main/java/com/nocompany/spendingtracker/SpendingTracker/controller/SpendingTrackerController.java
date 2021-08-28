package com.nocompany.spendingtracker.SpendingTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nocompany.spendingtracker.SpendingTracker.Entity.Category;
import com.nocompany.spendingtracker.SpendingTracker.Service.SpendingTrackerService;

@RestController
public class SpendingTrackerController {
	
	@Autowired
	SpendingTrackerService stService;
	
	@GetMapping("/ping")
	public String pingServer() {
		return "Hi.. you are in Spending Tracker Backend";
		
	}
	
	@GetMapping("/addCategory")
	public Category addCategory(@RequestParam(value="name") String categoryName) {
		
		return stService.addCategory(categoryName);
		
		
	}
}
