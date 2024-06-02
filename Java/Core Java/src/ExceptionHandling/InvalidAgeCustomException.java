package ExceptionHandling;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeChecker {
	public static void checkAge(int age) throws InvalidAgeException{
		if(age < 0) {
			throw new InvalidAgeException("Age cannot be negative!");
		}
		else if(age < 18) {
			throw new InvalidAgeException("You must be at least 18 years old!");
		}
		else {
			 System.out.println("Age is valid!");
		}
	}
}

public class InvalidAgeCustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		try {
			AgeChecker.checkAge(age);
		}catch(InvalidAgeException e) {
			System.out.println("Age Exception: " + e.getMessage());
		}
	}
}
