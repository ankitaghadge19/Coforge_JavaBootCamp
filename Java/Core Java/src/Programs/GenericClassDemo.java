package Programs;

class GenericClass<T>{
	private T value;
	
	public GenericClass(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<Integer> intObj = new GenericClass<>(40);
		System.out.println(intObj.getValue());
		
		GenericClass<String> strObj = new GenericClass<>("Hey!");
		System.out.println(strObj.getValue()); 
	}
}
