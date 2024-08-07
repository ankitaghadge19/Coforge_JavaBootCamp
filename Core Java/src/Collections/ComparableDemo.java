package Collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private  LocalDate joiningDate;
	
	public Employee(int id, String name, double salary, LocalDate joiningDate) {
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
    public int compareTo(Employee obj) {
    	return this.joiningDate.compareTo(obj.joiningDate);
    }
    
    @Override
    public String toString() {
    	return "Employee{id=" + id + ", name='" + name + "', salary="+ salary + ", joiningDate=" + joiningDate + '}';
    }
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "James", 70000, LocalDate.of(2020, 3, 1)));
		employees.add(new Employee(2, "Bob", 50000, LocalDate.of(2019, 3, 15)));
        employees.add(new Employee(3, "Charlie", 60000, LocalDate.of(2021, 7, 30)));
        employees.add(new Employee(4, "David", 55000, LocalDate.of(2020, 5, 1)));
        
        // Sort the list of employees by joining date
        Collections.sort(employees);
        
        for(Employee emp: employees) {
        	System.out.println(emp);
        }
	}
}
