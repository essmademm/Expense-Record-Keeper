
# Expense Record Keeper

## Student Name

Samira Zainalabidin

## Description

The Expense Record Keeper is a Java-based application designed to help users track personal and business expenses. It features a robust Command Line Interface (CLI) that allows users to record, categorize, and manage financial data with permanent storage in CSV files.

## Objectives

Implement core OOP principles: Encapsulation, Inheritance, and Polymorphism.
Develop a CRUD system (Create, Read, Update, Delete) for data management.
Ensure Data Persistence using file I/O operations (CSV).
Apply Input Validation and Error Handling to create a crash-proof application.


## Project Requirement List (10 Key Requirements)

* Add Expense: The system allows users to create new records for personal or business expenses.
* Display Expenses: Users can view a full list of all recorded expenses in a formatted table.
* Expense Categorization: Every expense must have a category (e.g., Food, Transport) and a specific type (Personal or Business).
* Automatic Date Tracking: The system automatically assigns the current date to each new expense using java.time.LocalDate.
* Update Functionality: Users can modify the amount or category of an existing record using its unique ID.
* Delete Functionality: The system allows for the removal of specific records from the list by their ID.
* Data Persistence (CSV): All data is saved to and loaded from a expenses.csv file, ensuring records are kept after closing the app.
* Input Validation: The system checks for invalid data (e.g., non-numeric values for amount) and prevents program crashes using try-catch blocks.
* Inheritance Implementation: The project includes a BusinessExpense class that extends the Expense class, adding a field for the company name.
* Data Export/Import: The application supports exporting the expense list to a standard CSV format that can be opened in Excel or Google Sheets.

    

# Documentation

## 1. Data Structures
* ArrayList: The core data structure used in the ExpenseManager class. It was chosen because it allows dynamic resizing, making it easy to add or remove expenses without knowing the total count in advance.
* Polymorphic List: The ArrayList<Expense> stores both Expense (parent) and BusinessExpense (child) objects, demonstrating Java's ability to handle different object types in a single collection.

## 2. Algorithms
### CRUD Logic:
* Search: To update or delete an expense, the system iterates through the list using a for loop (or removeIf) to find an object with a matching ID.
* Summation: The getTotal() method uses an accumulator pattern to sum up the amount field from all objects in the list.
### CSV Parsing: When importing data, the system reads the file line-by-line, splits each string by a comma (,), and converts the string tokens back into Integer, Double, and String types to reconstruct the objects.  

### 3. Functions and Modules
* Main Module: Handles the user interface and menu navigation.
* ExpenseManager: Acts as the controller, managing the logic for adding, deleting, and updating data.
* CSVManager: Dedicated module for File I/O operations, ensuring data is correctly formatted for Excel compatibility.
* Models (Expense/BusinessExpense): Define the data structure and handle self-representation (via display() and toCsv()).

## Chalenges facrd
* Data Consistency: One of the main challenges was ensuring that when a BusinessExpense is saved, the extra field Company Name is not lost. This was solved by overriding the toCsv() method in the child class Polymorphism.
* 



# Test Cases 
Action	Input Data	Expected Result
Add Personal	ID: 1, Amount: 100, Type: 1	Expense saved as "Personal"
Add Business	ID: 2, Amount: 500, Type: 2	Expense saved with "Company Name"
View All	Press '2'	All records are displayed in the console
Invalid Input	Amount: "hello"	System shows "Input error!"
File Export	Press '7'	Data is written to expenses.csv

## Files Used
* expenses.csv (export file)


