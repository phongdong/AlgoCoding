//package com.sept;
//
//class Customer {
//	int amount = 10;
//
//	synchronized void withdraw(int m) {
//		System.out.println("going to withdraw.");
//		if (this.amount < m) {
//			System.out.println("less balance, wait for deposit.");
//			try {
//				wait();
//			} catch(InterruptedException e) {}
//		}
//
//		this.amount -= m;
//		System.out.println("withdraw done. balance: " + this.amount);
//	}
//
//	synchronized void deposit(int m) {
//		System.out.println("going to deposit.");
//		this.amount += m;
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		notify();
//		System.out.println("deposit done. balance: " + this.amount );
//	}
//}
//
//class ThreadInteruppting extends Thread {
//	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println("Exception handled: " + e);
//		}
//		System.out.println("thread is running....");
//	}
//}
//
//public class InterThread {
//
//	public static void main(String[] args) {
//		/*
// 		Customer customer = new Customer();
// 		new Thread() {
// 			public void run() {
// 				customer.withdraw(15);
// 			}
// 		}.start();
//
// 		new Thread() {
// 			public void run() {
// 				customer.deposit(7);
// 			}
//  		}.start();
//  		*/
//		/*
//		ThreadInteruppting  t = new ThreadInteruppting();
//		t.start();
//		t.interrupt();
//		*/
//
//		System.out.println("messge");
//		System.k.println("error message");
//	}
//
//}
