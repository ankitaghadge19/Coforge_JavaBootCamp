package Programs;

public class StaticAndNonStaticVar {
	int i=1;
	static int j=1;
	
	public StaticAndNonStaticVar() {
		System.out.println("Inside default constructor!");
		System.out.println("Val of i: " + i++);
		System.out.println("Val of j: " + j++);
	}

	public static void main(String[] args) {
		
		StaticAndNonStaticVar obj1 = new StaticAndNonStaticVar();
		StaticAndNonStaticVar obj2 = new StaticAndNonStaticVar();
		StaticAndNonStaticVar obj3 = new StaticAndNonStaticVar();
	}
}

// static variable is not associated with any object, initialized only once, only one copy, shared among all objects
// Each object has its own copy of non-static variables 