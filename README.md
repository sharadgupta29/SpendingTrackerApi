# SpendingTrackerApi

Spending Tracker Overview

Points to be performed - 

Expense
	- Create new expenses
	- Remove expenses in case of product returned
	- View monthly expenses and Yearly expenses
	- Check monthly total expenses

Category
	- Create new category
	- View category details 5 at a time
	- Delete category
	- Find category like
	- Delete all categories
	
Track by date
	- Find total expense between particular date
	- Find total expense on particular product under specific date


Entity Structure - 

Expense
Id(long) 	 pk 	autogenerated
Date 	Date	 not null
Category	String	Nullable
Amount	Integer	Not null
AddDateTIme	sysdate
UpdateDateTIme	sysdate


Category
Sno(pk)	PK	Autogenerated
Name	String	Not null



Steps to follow-
*Create Spring boot project with JPA H2 and rest & web support and configure H2 console

*Setup postman

*Create table structure
*create restcontroller, repository and entity classes

Perform below requests - 
Basic - 
	1. Create one dummy request name as welcome to check connectivity between spring and postman
	2. Insert new category in category table and return with all categories fetched from database
	3. Update category by id using persist and return with specific category
	4. Provide now() as updateDatetime and addDatetime while inserting and updating category
	5. Find all categories using @NamedQueries
	6. Update all categories, set updateDateTIme as sysdate using annotations
	7. Insert expense with required category using JPA
	8. Find categories having more than 2 records of expense using JPQL
	9. Fetch category without expense using criteria query
	10. Fetch reviews sort by category name , amount
	11. Find total expense in particular time period and for particular category using jpa

Advance - 
	1. Create new project name as advance
	2. Create all above requests using Spring Data JPA
	3. Add 2nd level cache 
	4. Reset the cache
	5. Perform pagination for limit 3 at once
	

