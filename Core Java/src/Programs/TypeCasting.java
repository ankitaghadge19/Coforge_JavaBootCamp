package Programs;

public class TypeCasting {

	public static void main(String[] args) {
		// Implicit Type Casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // int to double (implicit)
        System.out.println("Implicit Type Casting (Widening Conversion):");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        // Explicit Type Casting (Narrowing Conversion)
        double doubleNumber = 3.14;
        int intNumber = (int) doubleNumber; // double to int (explicit)
        System.out.println("\nExplicit Type Casting (Narrowing Conversion):");
        System.out.println("double number: " + doubleNumber);
        System.out.println("int number: " + intNumber);

	}
}
