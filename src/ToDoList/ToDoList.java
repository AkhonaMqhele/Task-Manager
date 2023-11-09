package ToDoList;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    private ArrayList<Tasks> tasks;
    private Scanner input;
    
    public ToDoList(){
        this.tasks = new ArrayList<>();
        this.input = new Scanner(System.in);
    }
    private void displayMenu() {
        System.out.println("===== TO-DO LIST =====");
        System.out.println("1. Add a task");
        System.out.println("2. Mark a task as completed");
        System.out.println("3. Edit a task");
        System.out.println("4. Delete a task");
        System.out.println("5. View the to-do list");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
}
    private void addTask() {
        System.out.print("Enter the task name: ");
        String name = input.nextLine();
        System.out.print("Enter the task description: ");
        String description = input.nextLine();
        Tasks task = new Tasks(name, description);
        tasks.add(task);

        System.out.println("Task added successfully!");
}
    private void markTaskAsCompleted() {
        System.out.print("Enter the task name to mark as completed: ");
        String name = input.nextLine();

        for (Tasks task : tasks) {
            if (task.getTaskName().equals(name)) {
            task.setCompleted(true);
            System.out.println("Task marked as completed!");
                return;
            }
        }
            System.out.println("Task not found.");
    }
    private void editTask() {
        System.out.print("Enter the task name to edit: ");
        String name = input.nextLine();

        for (Tasks task : tasks) {
            if (task.getTaskName().equals(name)) {
            System.out.print("Enter the new task name: ");
            String newName = input.nextLine();
            System.out.print("Enter the new task description: ");
            String newDescription = input.nextLine();

           // task.setName(newName);
           // task.setDescription(newDescription);

            System.out.println("Task edited successfully!");
                return;
            }
        }
    }
    private void deleteTask() {
        System.out.print("Enter the task name to delete: ");
        String name = input.nextLine();
        for (Tasks task : tasks) {
            if (task.getTaskName().equals(name)) {
            tasks.remove(task);
            System.out.println("Task deleted successfully!");
               return;
            }
        }

        System.out.println("Task not found.");
    }
    private void viewTasks() {
        if (tasks.isEmpty()) {
        System.out.println("No tasks found.");
        } else {
             System.out.println("===== TO-DO LIST =====");
        for (Tasks task : tasks) {
            System.out.println("Task: " + task.getTaskName());
            System.out.println("Description: " + task.getTaskDescription());
            System.out.println("Status: " + (task.isCompleted() ? "Completed" : "Not completed"));
            System.out.println("----------------------");
            }
        }
    }
    public void run() {
    int option = -1;
    while (option != 0) {
    displayMenu();

    try {
        option = Integer.parseInt(input.nextLine());
        switch (option) {
            case 1:
                addTask();
                break;
            case 2:
                 markTaskAsCompleted();
                break;
            case 3:
             editTask();
                break;
            case 4:
                deleteTask();
                break;
            case 5:
                viewTasks();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
             input.close();
        }


    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.run();
    }
    
}
