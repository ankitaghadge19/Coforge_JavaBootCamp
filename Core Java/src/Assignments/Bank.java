package Assignments;

import java.util.Scanner;

class Account{
	private String name;
	private int age;
	private String accId;
	private String accType;
	private double balance;
	private double minBalance = 500;
	
	public Account(String name, int age, String accId, String accType, double balance) {
		this.name = name;
		this.age = age;
		this.accId = accId;
		this.accType = accType;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAccId() {
		return accId;
	}
	
	public String getAccType() {
		return accType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getMinBalance() {
		return minBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount deposited successfully. Balance is: " + balance);
	}
	
	public void withdraw(double amount) {
		if(balance - amount >= minBalance) {
			balance -= amount;
			System.out.println("Withdrawal successful. Balance is: " + balance);
		}else {
			System.out.println("Sorry! Not enough balance!");
		}
	}
}

public class Bank {
	
	private static Account account;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline
			
			switch(choice) {
			case 1 -> createAccount();
			case 2 -> displayAccount();
			case 3 -> checkBalance();
			case 4 -> depositAmount();
			case 5 -> withdrawAmount();
			case 6 -> {
				System.out.println("Bye!");
				return;
			}
			default -> System.out.println("Invalid Input!");
			}
			System.out.println("====================================================");
		}
	}
	
	private static void displayMenu() {
		System.out.println("\t1. Create Account");
        System.out.println("\t2. Display Account");
        System.out.println("\t3. Check Balance");
        System.out.println("\t4. Deposit Amount");
        System.out.println("\t5. Withdraw Amount");
        System.out.println("\t6. Exit");
        System.out.print("Enter your choice: ");
	}
	
	private static void createAccount() {
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		while(age < 18) {
			System.out.println("Minimum age should be 18 to create an account.");
            System.out.print("Please enter valid age: ");
            age = sc.nextInt();
		}
		sc.nextLine(); // Consume newline
		
		System.out.println("Enter your account Id: ");
		String accId = sc.nextLine();
		
		System.out.println("Enter your account type: ");
		String accType = sc.nextLine();
		
		System.out.println("Enter balance: ");
		double balance = sc.nextDouble();
		
		account = new Account(name, age, accId, accType, balance);
		System.out.println("Account created successfully.");	
	}
	
	private static void displayAccount() {
		if(account != null) {
			System.out.println("\nWelcome " + account.getName() + "! Your account details:");
			System.out.println("Age : " + account.getAge());
			System.out.println("Account Id: " + account.getAccId());
            System.out.println("Account Type: " + account.getAccType());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Minimum balance: " + account.getMinBalance());
		}else {
			System.out.println("No account exists! Please create an account!");
		}
	}
	
	private static void checkBalance() {
		if(account != null) {
			System.out.println("Balance is: " + account.getBalance());;
		}else {
			System.out.println("No account exists! Please create an account!");
		}
	}
	
	private static void depositAmount() {
		if(account != null) {
			 System.out.print("Enter the amount you want to deposit: ");
			 double amount = sc.nextDouble();
			 account.deposit(amount);
		}
		else {
			System.out.println("No account exists! Please create an account!");
		}
	}
	
	private static void withdrawAmount() {
		if(account != null) {
			System.out.println("Enter the amount you want to withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
		}
		else {
			System.out.println("No account exists! Please create an account!");
		}
	}
}
