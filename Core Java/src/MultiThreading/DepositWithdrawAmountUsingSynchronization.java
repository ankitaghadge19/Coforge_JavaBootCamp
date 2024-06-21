package MultiThreading;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public synchronized void deposit(double amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " -> Deposited: " + amount + ", New Balance: " + balance);
	}
	
	public synchronized void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName() + " -> Withdraw: " + amount + ", New Balance: " + balance);		
		}else {
			System.out.println(Thread.currentThread().getName() + "Dont have insufficient balance!");
		}
	}
	
	public double getBalance(){
		return balance;
	}
}

class Transaction extends Thread {
	private BankAccount account;
	private String transactionType;
	private double amount;
	
	public Transaction(BankAccount account, String transactionType, double amount) {
		this.account = account;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		if(transactionType.equalsIgnoreCase("deposit")) {
			account.deposit(amount);
		}else if(transactionType.equalsIgnoreCase("withdraw")) {
			account.withdraw(amount);
		}
		else {
			System.out.println("Invalid transaction type!");
		}
	}
}

public class DepositWithdrawAmountUsingSynchronization {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		Transaction t1 = new Transaction(account, "deposit", 500);
		Transaction t2 = new Transaction(account, "withdraw", 700);
		Transaction t3 = new Transaction(account, "deposit", 300);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			 t1.join();
	         t2.join();
	         t3.join();	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance: " + account.getBalance());
	}
}
