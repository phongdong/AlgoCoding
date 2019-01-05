package com.sept;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadWorker implements Runnable {
	private String message;
	public ThreadWorker(String m) {
		this.message = m;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": (Start) Message: " + message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": (End)");
	}
}



public class ThreadDemo {
	public static void main(String[] args) throws IOException {
		/*
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new ThreadWorker("" + i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		while(!executor.isTerminated());
		System.out.println("Finished All Threads.");
		*/
		Runtime.getRuntime().exec("notes");
		
	}
}
