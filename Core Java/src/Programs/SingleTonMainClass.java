package Programs;

public class SingleTonMainClass {

	public static void main(String[] args) {
		SingleTonClass obj1=SingleTonClass.getInstance();
	    SingleTonClass obj2=SingleTonClass.getInstance();
	    obj1.message("Hey!");
	    obj2.message("How are you?");
	}
}

// obj2 and obj1 refer to the same instance, this call is made on the same object as the previous call
// getInstance() method is static so we can directly call it through class -> SingleTonClass.getInstance();