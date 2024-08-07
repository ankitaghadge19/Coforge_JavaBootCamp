package Collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeData {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;

    public EmployeeData(int id, String name, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "EmployeeData{id=" + id + ", name='" + name + "', salary=" + salary + ", joiningDate=" + joiningDate + '}';
    }
}

public class ComparatorDemo {

	public static void main(String[] args) {

        ArrayList<EmployeeData> employees = new ArrayList<>();

        employees.add(new EmployeeData(1, "James", 70000, LocalDate.of(2020, 3, 1)));
        employees.add(new EmployeeData(2, "Bob", 50000, LocalDate.of(2019, 3, 15)));
        employees.add(new EmployeeData(3, "Charlie", 60000, LocalDate.of(2021, 7, 30)));
        employees.add(new EmployeeData(4, "David", 55000, LocalDate.of(2020, 5, 1)));

        // Print the original list of employees
        System.out.println("Original list of employees:");
        for (EmployeeData emp : employees) {
            System.out.println(emp);
        }

        // Comparator to sort EmployeeData objects on the basis of salary
        Comparator<EmployeeData> empSalaryComparator = new Comparator<EmployeeData>() {
            public int compare(EmployeeData e1, EmployeeData e2) {
                return Double.compare(e1.getSalary(), e2.getSalary()); // Descending order: compare(e2.getSalary(), e1.getSalary());     
            }
        };
        Collections.sort(employees, empSalaryComparator);
        System.out.println("EmployeeData sorted based on salary: "+employees);
        
        // Comparator to sort EmployeeData objects on the basis of joining date
        Comparator<EmployeeData> empJoiningDateComparator = new Comparator<EmployeeData>() {
        	public int compare(EmployeeData e1, EmployeeData e2) {
        		return e1.getJoiningDate().compareTo(e2.getJoiningDate());
        	}
        };
        Collections.sort(employees, empJoiningDateComparator);
        System.out.println("EmployeeData sorted based on joining date: "+employees);
        
       // Comparator to sort EmployeeData objects on the basis of name
       Comparator<EmployeeData> empNameComparator = new Comparator<EmployeeData>() {
    	   public int compare(EmployeeData e1, EmployeeData e2) {
    		   return e1.getName().compareTo(e2.getName());
    	   }
       };
       Collections.sort(employees, empNameComparator);
       System.out.println("EmployeeData sorted based on name: "+employees);
    }
}
