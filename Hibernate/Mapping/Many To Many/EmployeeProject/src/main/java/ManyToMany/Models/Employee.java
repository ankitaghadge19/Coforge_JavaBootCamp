package ManyToMany.Models;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Employee")
@Table(name = "EMPLOYEE", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Employee {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private Integer empId;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeProject> employeeProjects = new HashSet<>();

    // Constructors
    public Employee() {
    }

    public Employee(Integer empId, String email){
        this.empId = empId;
        this.email = email;
    }

    public Employee(String email) {
        this.email = email;
    }

    // Getter & Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<EmployeeProject> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }
}
