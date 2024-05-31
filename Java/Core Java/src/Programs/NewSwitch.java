package Programs;
import java.util.Scanner;

public class NewSwitch {
	public static void main( String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (1-3): ");
		int choice = sc.nextInt();
		
		String result = switch(choice) {
			case 1 -> {
				yield "You chose option 1";
			}
			case 2, 3 -> {
				yield "You chose optoion 2, 3";
			}
			default -> {
				yield "Invalid choice!";
			}
		};
		System.out.println(result);
	}

}
