package com.company.employee;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Meera", "HR", 45000));
        manager.addEmployee(new Employee(102, "Suresh", "Developer", 55000));
        manager.addEmployee(new Employee(103, "Anjali", "Designer", 40000));

        System.out.println("All Employees:");
        manager.displayAll();

        System.out.println("\nSearching for Employee ID 102:");
        manager.searchById(102);

        System.out.println("\nDeleting Employee ID 101:");
        manager.deleteById(101);

        System.out.println("\nAll Employees After Deletion:");
        manager.displayAll();
    }
}
