package Programs;

public class TypesOfConstructor {
	
	int i=1, j=2;
	
	public TypesOfConstructor() {
		System.out.println("Inside default constructor!");
	}
	
	public TypesOfConstructor(int i, int j) {
		this(); // Calls the default constructor
		System.out.println(this.i + " " + this.j); // Prints initial values of instance variables
		System.out.println(i + " " + j);  //prints the local variables i and j which are the parameters passed to this constructor
		System.out.println("After using this keyword: ");
		this.i = i;
		this.j = j;
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		TypesOfConstructor obj1 = new TypesOfConstructor();
		TypesOfConstructor obj2 = new TypesOfConstructor(3, 4);
	}
}
