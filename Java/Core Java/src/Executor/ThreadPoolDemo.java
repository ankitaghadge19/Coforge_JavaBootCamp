package Executor;

//import java.util.concurrent.Executor;
import java.util.concurrent.*;

public class ThreadPoolDemo implements Runnable {
	
	private String name;
	
	public ThreadPoolDemo(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName() + " -> " + this.name);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		String []names = {"Ruby", "James", "Hardin", "Tessa", "Edward"};
		
		for(String name:names) {
			Runnable runnable = new ThreadPoolDemo(name);
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}
}
