package com.cognizant.employee.model;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private Department department;
    private List<String> skills;

    public Employee() {}  // Required by Spring

    public int getId() {
        return id;
    }

    public void setId(int id) {   // Setter
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  // Setter
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {  // Setter
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {  // Setter
        this.skills = skills;
    }
}
