package com.sparrow.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ToDoList toDoList = new ToDoList(); // creates to do list object
        Scanner scanner = new Scanner(System.in); // create user input.
        boolean running = true; // keep application running

        while (running) {
            System.out.println("/nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit Application");
            System.out.println("Choose an option please:");
            int choice = scanner.nextInt(); // gets the choice
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine(); // gets name from user input.
                    toDoList.addTask(taskName); // adds the task to the list
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskIndexToComplete = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(taskIndexToComplete);
                    break;
                case 4:
                    System.out.print("Enter task number to remove: ");
                    int taskIndexToRemove =scanner.nextInt() - 1;
                    toDoList.removeTask(taskIndexToRemove); // removes the task
                    break;
                case 5:
                    running = false; // exit app
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }

        scanner.close();
        System.out.println("Exiting the Application.");
    }
}
