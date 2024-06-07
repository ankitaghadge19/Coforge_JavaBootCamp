package ManyToMany.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPLOYEE_PROJECT")
public class EmployeeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;

    // Constructors, getters, and setters
    public EmployeeProject() {
    }

    public EmployeeProject(Employee employee, Project project) {
        this.employee = employee;
        this.project = project;
    }

    // Getter & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
