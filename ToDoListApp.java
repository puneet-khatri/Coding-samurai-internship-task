
// Import the necessary libraries
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Define a class to represent a task
class Task {
    // Declare the attributes of a task
    private String title; // The title of the task
    private String description; // The description of the task
    private LocalDate dueDate; // The due date of the task
    private boolean completed; // The completion status of the task

    // Define a constructor to initialize a task with given values
    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false; // By default, a task is not completed
    }

    // Define getters and setters for the attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Define a method to display the task details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Due date: " + dueDate);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
        System.out.println();
    }
}

// Define a class to represent a to-do list application
class ToDoListApp {
    // Declare a scanner object to read user input
    private static Scanner scanner = new Scanner(System.in);

    // Declare an array list to store the tasks
    private static ArrayList<Task> tasks = new ArrayList<>();

    // Define a method to display the main menu and get user choice
    public static int displayMenu() {
        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("Please choose an option from the menu:");
        System.out.println("1. Add a task");
        System.out.println("2. Mark a task as complete");
        System.out.println("3. View tasks");
        System.out.println("4. Remove a task");
        System.out.println("5. Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt(); // Read the user choice as an integer
        scanner.nextLine(); // Consume the newline character
        return choice; // Return the user choice
    }

    // Define a method to add a task to the list
    public static void addTask() {
        System.out.println("Adding a new task...");
        System.out.print("Enter the title of the task: ");
        String title = scanner.nextLine(); // Read the title as a string
        System.out.print("Enter the description of the task: ");
        String description = scanner.nextLine(); // Read the description as a string
        System.out.print("Enter the due date of the task (yyyy-mm-dd): ");
        String date = scanner.nextLine(); // Read the date as a string
        LocalDate dueDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE); // Parse the date as a LocalDate object
        Task task = new Task(title, description, dueDate); // Create a new task object with the given values
        tasks.add(task); // Add the task object to the list
        System.out.println("Task added successfully!");
    }

    // Define a method to mark a task as complete
    public static void markTaskAsComplete() {
        System.out.println("Marking a task as complete...");
        if (tasks.isEmpty()) { // Check if the list is empty
            System.out.println("There are no tasks in the list.");
            return; // Exit the method
        }
        System.out.print("Enter the index of the task to mark as complete (starting from 1): ");
        int index = scanner.nextInt(); // Read the index as an integer
        scanner.nextLine(); // Consume the newline character
        if (index < 1 || index > tasks.size()) { // Check if the index is out of range
            System.out.println("Invalid index. Please try again.");
            return; // Exit the method
        }
        Task task = tasks.get(index - 1); // Get the task object at the given index (subtract 1 because array list is
                                          // zero-based)
        if (task.isCompleted()) { // Check if the task is already completed
            System.out.println("This task is already completed.");
            return; // Exit the method
        }
        task.setCompleted(true); // Set the completion status of the task to true
        System.out.println("Task marked as complete successfully!");
    }

    // Define a method to view the tasks in the list
    public static void viewTasks() {
        System.out.println("Viewing the tasks...");
        if (tasks.isEmpty()) { // Check if the list is empty
            System.out.println("There are no tasks in the list.");
            return; // Exit the method
        }
        for (int i = 0; i < tasks.size(); i++) { // Loop through the list of tasks
            Task task = tasks.get(i); // Get the task object at the current index
            System.out.println("Task " + (i + 1) + ":"); // Display the task number (add 1 because array list is
                                                         // zero-based)
            task.display(); // Display the task details
        }
    }

    // Define a method to remove a task from the list
    public static void removeTask() {
        System.out.println("Removing a task...");
        if (tasks.isEmpty()) { // Check if the list is empty
            System.out.println("There are no tasks in the list.");
            return; // Exit the method
        }
        System.out.print("Enter the index of the task to remove (starting from 1): ");
        int index = scanner.nextInt(); // Read the index as an integer
        scanner.nextLine(); // Consume the newline character
        if (index < 1 || index > tasks.size()) { // Check if the index is out of range
            System.out.println("Invalid index. Please try again.");
            return; // Exit the method
        }
        tasks.remove(index - 1); // Remove the task object at the given index (subtract 1 because array list is
                                 // zero-based)
        System.out.println("Task removed successfully!");
    }

    // Define a main method to run the application
    public static void main(String[] args) {
        boolean exit = false; // Declare a boolean variable to control the loop
        while (!exit) { // Loop until exit is true
            int choice = displayMenu(); // Display the menu and get user choice
            switch (choice) { // Execute different actions based on user choice
                case 1:
                    addTask(); // Call the addTask method
                    break;
                case 2:
                    markTaskAsComplete(); // Call the markTaskAsComplete method
                    break;
                case 3:
                    viewTasks(); // Call the viewTasks method
                    break;
                case 4:
                    removeTask(); // Call the removeTask method
                    break;
                case 5:
                    exit = true; // Set exit to true to end the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Handle invalid choice
                    break;
            }
            System.out.println();
        }
        System.out.println("Thank you for using the To-Do List Application!");
    }
}