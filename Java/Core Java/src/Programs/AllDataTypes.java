package Programs;

public class AllDataTypes {

	public static void main(String[] args) {
		// Primitive data types
        byte byteValue = 10;                    // 1 byte
        short shortValue = 1000;               // 2 bytes
        int intValue = 100000;                // 4 bytes
        long longValue = 1000000000L;        // 8 bytes
        float floatValue = 3.14f;           // 4 bytes
        double doubleValue = 3.14159;      // 8 bytes
        char charValue = 'A';             // 2 bytes 
        boolean booleanValue = false;    // 1 bit (true or false)

        
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Non-primitive data type (String)
        String stringValue = null;
        System.out.println("\nDefault value of String: " + stringValue);
	}
}
