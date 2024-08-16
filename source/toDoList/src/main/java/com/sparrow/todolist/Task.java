package com.sparrow.todolist;

public class Task {
    private String name;
    private boolean isCompleted;

    // constructor
    public Task(String name) {
        this.name = name;
        this.isCompleted = false; // by default, as task is NOT complete when created.
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    // mark task is completed
    public void markAsCompleted(){
        this.isCompleted = true;

    }

    public String toString(){
        return   (isCompleted ? "[X] " : "[ ]" + name);
    }


}
