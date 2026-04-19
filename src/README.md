
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
* Ensuring that the company field in BusinessExpense was saved correctly alongside the parent fields was tricky. I solved this by using Method Overriding on the toCsv() method, allowing each object to define its own storage format.
* Handling non-numeric inputs (like letters instead of an ID) without crashing the program required careful use of Try-Catch blocks and loops to ensure a smooth user experience.




# Test Cases 
1. Adding a Personal Expense
Input:1, ID: 1, Amount: 150.50, Category: Lunch, Type: 1 (Personal).
Output: 1 | 150.5 | Lunch | [Current Date] | Personal.

3. Business Expense
Input:1, ID: 2, Amount: 2000, Category: Hardware, Type: 2 (Business), Company: Microsoft.
Output:2 | 2000.0 | Hardware | [Date] | Business (Microsoft).

4. Data Validation (Error Handling)
 Input:1,ID:3 Amount:no nunber.
 Output: The console displays Input error!

5. Updating 
User Input:3 ID: 1, New Amount: 180.00, New Category: Dinner.
Output: The system updates the record. Option 2 now shows the new values for ID 1.


##  Data Storage
The project uses the following files for data persistence:
*   **expenses.csv:** A text-based file used for data export and import. It stores ID, Amount, Category, Date, and Type (Personal/Business) in a comma-separated format compatible with Excel.




