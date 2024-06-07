package ManyToMany.Models;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer projectId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "project")
    private Set<EmployeeProject> employeeProjects = new HashSet<>();

    // Constructors, getters, and setters
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    // Getter & Setters
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeProject> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }
}
