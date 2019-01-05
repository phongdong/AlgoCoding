package com.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//abstract class Arithmetic {
//    abstract int add(int a, int b);  
//}
//
//public class Test extends Arithmetic {
//
//	public static void main(String[] args) {
//		int x = 3 & 5;
//		int y = 3 | 5;
//		System.out.println(x);
//		System.out.println(y);
//
//	}
//
//	@Override
//	int add(int a, int b) {
//		System.out.println("Arithmetic");
//		return (a+b);
//	}
//
//}

enum Color {
	RED, GREEN, YELLOW;
}

class SampleDemo implements Runnable {

	private Thread t;
	private String threadName;

	SampleDemo(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		while (true)
			System.out.print(threadName);
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}

public class Test {

	public static void main(String args[]) {
		Color color = Color.GREEN;
		System.out.println();
		/*
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		B.start();
		A.start();
		*/
		/*
		int x = 123;
		int result = 0;
		while (x > 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		System.out.println(result);
		*/
		
		/*
		int[] a = {1,2,5,8,13,16};
		findPair(a, 10);
		*/
		/*
		ArrayList<Integer> flowerPot = new ArrayList<Integer>();
		flowerPot.add(0);
		flowerPot.add(1);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(1);
		flowerPot.add(1);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(0);
		
		flowerPlant(flowerPot);
		*/
		int [] a = {1,2,4,4};
		//findSum(sortedArray, 8);
		findPairWithSum(a, 8);
	}
	
	static void findSum(int[] sortedArray, int sum) {
		int l = 0, r = sortedArray.length-1;
		while (l < r) {
			if (sortedArray[l] + sortedArray[r] == sum) {
				System.out.println(sortedArray[l] + " : " + sortedArray[r]);
				break;
			}
			else if (sortedArray[l] + sortedArray[r] > sum) {
				r--;
			}
			else 
				l++;
		}
	}
	
	static void findPairWithSum(int[] a, int sum) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			int complement = sum - a[i];
			if (hashSet.contains(complement))
				System.out.println(complement + " : " + a[i]);
			else {
				hashSet.add(a[i]);
			}
		}
	}
	
	static void flowerPlant(ArrayList<Integer> list) {
		//[0, 1, 0, 0, 1, 1, 0, 0, 0, 0]
		// [0, 1, 0, 0, 1, 1, 0, 1, 0, 1]
		int n = list.size() - 1;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0 || i == n) {
				if (i == 0 && list.get(i) == 0 && list.get(i+1) == 0) 
					list.set(i, 1);
				else if (i == n && list.get(i) == 0 && list.get(i-1) == 0)
					list.set(i, 1);
			} else {
				if (list.get(i-1) == 0 && list.get(i) == 0 && list.get(i+1) == 0) 
					list.set(i, 1);
			}
			
		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
	
	/*
	 * [1,2,5,8,13,16]
	 * target = 10
	 */
	
	static void findPair(int[] a, int target) {
		int l = 0, r = a.length - 1;
		while (l < r) {
			if (a[r] > target)
				r--;
			if (a[l] + a[r] <= target) {
				System.out.println(a[l] + " : " + a[r]);
				l++;
				if (l==r) {
					r--;
					l = 0;
				}
			} else  {
				r--;
				l = 0;
			}
		}
	}
	
	

}
