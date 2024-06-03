package TypesOfInterface;

interface Employee{
}

class EmployeeRecords implements Employee{
	private String name;
    private int id;
    
    public EmployeeRecords(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class MarkerInterface {

	public static void main(String[] args) {
		EmployeeRecords empObj = new EmployeeRecords("Hardin", 101);
		
		if(empObj instanceof Employee) {
			System.out.println("Markable interface is implemented!");
		}else {
			System.out.println("Not implemented1");
		}
	}
}
