package Programs;
import java.util.Scanner;

public class NoOfDaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		String month = sc.nextLine();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		int NoOfDays = switch(month) {
		case "January", "March",  "May",  "July", "August",  "October",  "December" -> 31;
		case "April", "June", "September", "November" -> 30;
		case "February" -> {
			if(year%400 == 0)yield 29;
			else if(year%100 == 0) yield 28;
			else if(year%4==0) yield 29;
			else yield 28;
		}
		default -> 30;
		};
		System.out.println("No of Days " + NoOfDays);
	}
}
