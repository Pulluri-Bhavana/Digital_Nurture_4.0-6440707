package com.company.employee;

public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public void displayAll() {
        if (size == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < size; i++) {
                employees[i].display();
            }
        }
    }

    public void searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void deleteById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
