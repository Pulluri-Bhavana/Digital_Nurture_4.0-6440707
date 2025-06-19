package com.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Interface", "Pending"));
        taskList.addTask(new Task(2, "Implement Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Not Started"));

        System.out.println("All Tasks:");
        taskList.displayAllTasks();

        System.out.println("\nSearching for Task ID 2:");
        taskList.searchTask(2);

        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTaskById(1);

        System.out.println("\nTasks After Deletion:");
        taskList.displayAllTasks();
    }
}
