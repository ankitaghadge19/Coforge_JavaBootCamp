package Executor;

import java.util.concurrent.*;

class ArraySumTask implements Callable<Integer>{
	private final int[] array;
	private final int start;
	private final int end;
	
	ArraySumTask(int[] array, int start, int end){
		this.array = array;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public Integer call() {
		int sum = 0;
		for(int i=start; i<end; i++) {
			sum += array[i];
		}
		return sum;
	}
}

public class FutureAndCallable {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int numThreads = 2;
		int chunkSize = array.length/numThreads;
		
		// Create a fixed thread pool
		ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
		
		// Array to hold Future objects for the results
		Future<Integer>[] futures = new Future[numThreads];
		
		// Submit tasks to executor
		for(int i=0; i<numThreads; i++) {
			int start = i*chunkSize;
			int end = Math.min(start + chunkSize, array.length);
			
			futures[i] = executorService.submit(new ArraySumTask(array, start, end));
		}
		
		int totalSum = 0;
		
		// Collect results from Futures
		for(int i=0; i<numThreads; i++) {
			try {
				totalSum += futures[i].get();
			}catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		// Shutdown the executor service
		executorService.shutdown();
		
		System.out.println("Total sum of array elements: "+totalSum);
	}
}
