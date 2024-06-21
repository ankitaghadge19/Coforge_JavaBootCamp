package MultiThreading;

class BankTransaction extends Thread{
	private String transaction;
	
	public BankTransaction(String transactionName, int priority) {
		super(transactionName);
		this.setPriority(priority);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " -> Start");
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println(Thread.currentThread().getName() + " -> End");	
	}
}

public class SetPriorityDemo {

	public static void main(String[] args) {
		BankTransaction t1 = new BankTransaction("T1", 4);
		BankTransaction t2 = new BankTransaction("T2", 6);
		BankTransaction t3 = new BankTransaction("T3", 5);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
