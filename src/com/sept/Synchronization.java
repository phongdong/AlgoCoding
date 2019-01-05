package com.sept;

class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * n);
			try  {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		final String resource1 = "resource 1";
		final String resource2 = "resource 2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName() + " locked resource1");
				}
				
				try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
				
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " locked resource2");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + " locked resource2");
				}
				
				try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
				
				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName() + " locked resource1");
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
