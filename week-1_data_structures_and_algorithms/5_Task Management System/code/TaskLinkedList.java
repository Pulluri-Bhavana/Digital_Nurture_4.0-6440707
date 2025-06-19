package com.taskmanager;

public class TaskLinkedList {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteTaskById(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task " + taskId + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task " + taskId + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task " + taskId + " deleted.");
        }
    }

    public void searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                System.out.println("Task found:");
                current.task.display();
                return;
            }
            current = current.next;
        }
        System.out.println("Task " + taskId + " not found.");
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode current = head;
        while (current != null) {
            current.task.display();
            current = current.next;
        }
    }
}
