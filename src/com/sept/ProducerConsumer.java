package com.sept;

import java.rmi.server.ServerCloneException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {
	public static void main(String[] args) {
		/*
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		Producer p = new Producer(sharedQueue);
		Consumer c = new Consumer(sharedQueue);
		p.start();
		c.start();
		*/
		
		/*
		Thread thread = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + 
						": is executed the run() method.");
				for (int i = 0; i < 20; i++) {
					System.out.println(i);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		System.out.println(Thread.currentThread().getName()
				+ " calling start() method.");
		thread.start();
		*/
		
		/*
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + 
				": calling run() method.");
		
		thread.run();
		*/
		
		Server server = new Server();
		
		Thread t = new Thread(server, "T1");
		t.start();
		
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": is stopping server thread.");
		server.stop();
		
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " is finished now.");
			
	}
}

class Server implements Runnable {
	private volatile static boolean exist = false;
	public void run() 
	{
		while(!exist) {
			System.out.println("Server is running...");
		}
		System.out.println("Server is stopped.");
	}
	
	public void stop() {
		exist = true;
	}
}



class Producer extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	public Producer(BlockingQueue<Integer> q) {
		super("PRODUCER");
		this.sharedQueue = q;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(getName() + " produced " + i);
				sharedQueue.put(i);
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	public Consumer(BlockingQueue<Integer> q) {
		super("Consumer");
		this.sharedQueue = q;
	}
	
	public void run() {
		while (true) {
			try {
				int item = sharedQueue.take();
				System.out.println(getName() + " consumed " + item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



















/*
public class ProducerConsumer {

	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		producer.start();
		consumer.start();
	}
}

class Producer extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	public Producer(BlockingQueue<Integer> q) 
	{
		super("PRODUCER");
		sharedQueue = q;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(getName() + " produced " + i);
				sharedQueue.add(i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	public Consumer(BlockingQueue<Integer> q) {
		super("CONSUMER");
		sharedQueue = q;
	}
	
	public void run() {
		while(true) {
			try {
				Integer item = sharedQueue.take();
				System.out.println(getName() + " consumed " + item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}*/