
# Expense Record Keeper

## Student Name

Samira Zainalabidin

## Description

This project is a Java console-based application designed to track personal and business expenses. Users can add, view, update, and delete expense records. The system stores data in files and supports import/export using CSV format.

## Objectives

* To create a simple expense tracking system
* To practice Object-Oriented Programming (OOP)
* To implement CRUD operations
* To store and retrieve data from files
* To demonstrate data import/export

## Project Requirements List

1. Add new expense
2. View all expenses
3. Update existing expense
4. Delete expense
5. Save data to file
6. Load data from file
7. Input validation
8. Error handling
9. CLI menu interface
10. Import/export CSV

## Documentation

### Data Structures

* ArrayList is used to store expense objects.

### Algorithms

* Loop is used to search, update, and delete records.
* File reading/writing for data persistence.

### Modules / Classes

* Expense → stores data
* BusinessExpense → extends Expense
* ExpenseManager → manages operations (CRUD)
* FileManager → handles file saving/loading
* CSVManager → handles import/export
* Main → user interface

### Challenges

* Handling file input/output
* Managing incorrect user input

## Test Cases and Outputs

### Test Case 1: Add Expense

Input:
1
ID: 1
Amount: 100
Category: Food

Output:
1 | 100 | Food

### Test Case 2: Update Expense

Input:
3
ID: 1
New amount: 200

Output:
1 | 200 | Food

### Test Case 3: Delete Expense

Input:
4
ID: 1

Output:
(Expense removed)

### Test Case 4: Export CSV

Input:
7

Output:
Exported to CSV!

## Files Used

* data.dat (binary file)
* expenses.csv (export file)


