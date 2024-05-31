package Programs;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Optional: some validation
            this.age = age;
        }
    }
}

public class GetterSetterMethod {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("James", 30);

        // Use getter methods to access the variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Use setter methods to modify the variables
        person.setName("Ruby");
        person.setAge(25);

        // Use getter methods again to see the updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
