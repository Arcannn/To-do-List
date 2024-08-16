package com.sparrow.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    // constructor to start the to-do list
    public ToDoList() {
        tasks = new ArrayList<>();

    }

    // add tasks to the list
    public void addTask(String taskName){
        tasks.add(new Task(taskName));
        System.out.println("Task Created: " + taskName);
    }

    // remove a task from the list
    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            System.out.println("Task marked as completed: " + tasks.get(taskIndex).getName());
        } else {
            System.out.println("TASK NOT VALID");
        }
    }

    public void markTaskAsCompleted (int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()){
            tasks.get(taskIndex).markAsCompleted();
            System.out.println("Task marked as completed: " + tasks.get(taskIndex).getName());

        } else {
            System.out.println("TASK NOT VALID.");
        }
    }

    // display the classes
    public void viewTasks() {
        if(tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + "." + tasks.get(i));
            }


        }

    }


}
