# To-Do List Application

## Introduction

The To-Do List Application is a simple Java console-based application designed to help users manage their tasks efficiently. This application allows users to add tasks, mark tasks as complete, view their tasks, and remove tasks from the to-do list. The application is implemented in Java and uses basic input/output through the console.

## Getting Started

To run the To-Do List Application, follow these steps:

1. **Clone the Repository:**
   Clone the repository to your local machine using the following command:

   ```bash
   git clone <repository-url>
   ```

2. **Compile the Java Code:**
   Navigate to the project directory and compile the Java code using the following command:

   ```bash
   javac ToDoListApp.java
   ```

3. **Run the Application:**
   After compilation, run the application using the following command:

   ```bash
   java ToDoListApp
   ```

## Features

### 1. Add a Task

Users can add a new task to the to-do list by providing the title, description, and due date of the task.

### 2. Mark a Task as Complete

Users can mark a task as complete by entering the index of the task they want to mark. The application prevents marking tasks that are already completed.

### 3. View Tasks

Users can view the details of all tasks in the to-do list. The details include the title, description, due date, and completion status.

### 4. Remove a Task

Users can remove a task from the to-do list by entering the index of the task they want to remove.

### 5. Exit

Users can exit the application when they are done managing their tasks.

## Usage

1. **Adding a Task:**
   - Choose option 1 from the main menu.
   - Enter the title, description, and due date of the task as prompted.

2. **Marking a Task as Complete:**
   - Choose option 2 from the main menu.
   - Enter the index of the task you want to mark as complete.

3. **Viewing Tasks:**
   - Choose option 3 from the main menu.
   - All tasks in the to-do list will be displayed with their details.

4. **Removing a Task:**
   - Choose option 4 from the main menu.
   - Enter the index of the task you want to remove.

5. **Exiting the Application:**
   - Choose option 5 from the main menu to exit the application.

## Sample Usage

1. **Adding a Task:**
   ```
   Welcome to the To-Do List Application!
   Please choose an option from the menu:
   1. Add a task
   2. Mark a task as complete
   3. View tasks
   4. Remove a task
   5. Exit
   Your choice: 1

   Adding a new task...
   Enter the title of the task: Complete Project
   Enter the description of the task: Finish coding and documentation
   Enter the due date of the task (yyyy-mm-dd): 2023-12-01
   Task added successfully!
   ```

2. **Marking a Task as Complete:**
   ```
   Welcome to the To-Do List Application!
   Please choose an option from the menu:
   1. Add a task
   2. Mark a task as complete
   3. View tasks
   4. Remove a task
   5. Exit
   Your choice: 2

   Marking a task as complete...
   Task 1:
   Title: Complete Project
   Description: Finish coding and documentation
   Due date: 2023-12-01
   Completed: No

   Enter the index of the task to mark as complete (starting from 1): 1
   Task marked as complete successfully!
   ```

3. **Viewing Tasks:**
   ```
   Welcome to the To-Do List Application!
   Please choose an option from the menu:
   1. Add a task
   2. Mark a task as complete
   3. View tasks
   4. Remove a task
   5. Exit
   Your choice: 3

   Viewing the tasks...
   Task 1:
   Title: Complete Project
   Description: Finish coding and documentation
   Due date: 2023-12-01
   Completed: Yes
   ```

4. **Removing a Task:**
   ```
   Welcome to the To-Do List Application!
   Please choose an option from the menu:
   1. Add a task
   2. Mark a task as complete
   3. View tasks
   4. Remove a task
   5. Exit
   Your choice: 4

   Removing a task...
   Task 1:
   Title: Complete Project
   Description: Finish coding and documentation
   Due date: 2023-12-01
   Completed: Yes

   Enter the index of the task to remove (starting from 1): 1
   Task removed successfully!
   ```

5. **Exiting the Application:**
   ```
   Welcome to the To-Do List Application!
   Please choose an option from the menu:
   1. Add a task
   2. Mark a task as complete
   3. View tasks
   4. Remove a task
   5. Exit
   Your choice: 5

   Thank you for using the To-Do List Application!
   ```

## Conclusion

The To-Do List Application provides a straightforward way for users to manage their tasks, offering basic functionality for adding, marking, viewing, and removing tasks from the to-do list. Users can use the console-based interface to interact with the application and stay organized in their daily tasks.
