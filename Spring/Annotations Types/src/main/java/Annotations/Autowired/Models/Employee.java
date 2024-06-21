package Annotations.Autowired.Models;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department Name: " + department.getDeptName());
    }
}
