package ExceptionHandling;

//Unchecked Exception(Run Time)
class ArrayIndexOutOfBoundExcep{
	public void printArray(int[] array) {
		try {
			int element = array[5];	// This will cause an ArrayIndexOutOfBoundsException
			System.out.println("Array: "+ element);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index: "+e.getMessage());
			e.printStackTrace();
		}
	}
}

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		ArrayIndexOutOfBoundExcep obj = new ArrayIndexOutOfBoundExcep();
		int[] x = {1, 2, 3, 4, 5};
		obj.printArray(x);
	}
}
