
package todolistmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTo-Do List Manager:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a completed task");
            System.out.println("3. Display all tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove!");
                    } else {
                        System.out.println("Enter the number of the task to remove:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        int taskIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (taskIndex > 0 && taskIndex <= tasks.size()) {
                            tasks.remove(taskIndex - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty!");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the To-Do List Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
