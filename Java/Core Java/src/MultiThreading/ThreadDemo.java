package MultiThreading;

class checkServerStatus extends Thread{
	public void run() {
		while(true) {
			try {
				System.out.println("Checking server status...");
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("Checking server status was inturrupted!");
				return;
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		checkServerStatus obj = new checkServerStatus();
		Thread thread = new Thread(obj);
		thread.start();

	}

}
