package com.sept;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class A
{
	{
		System.out.println("a");
	}
}

class B extends A
{
	{
		System.out.println("b");
	}
}

class C extends B {
	{
		System.out.println("c");
	}
}

public class Easy {

	public static void main(String[] args) {
		/*
		int[] a1 = new int[] { 1, 2, 2, 3 };
		int[] a2 = new int[] { 6, 5, 4, 3 };
		int[] a3 = new int[] { 1, 2, 3, 4, 5 };
		int[] a4 = new int[] { 1, 3, 2 };

		System.out.println(isMonotonicOptmised(a1));
		System.out.println(isMonotonicOptmised(a2));
		System.out.println(isMonotonicOptmised(a3));
		System.out.println(isMonotonicOptmised(a4));
		*/
		
//		int[] nums = new int[] {1,2,3,4};
//		productExceptSelf(nums);
		
//		int[] a = {1,1};
//		int[] b = {2,2};
//		fairCandySwap(a, b);
		//1 2 2 3 3 4 7 8
		//int[] nums = {4,3,2,7,8,2,3,1};
		
		//findDisappearedNumbers2(nums);
		
		C c = new C();
	}
	
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
		List<Integer> list = new ArrayList<>();
		boolean[] a = new boolean[nums.length];
		for (int n: nums) {
			a[n-1] = true;
		}
		
		for (int j = 0; j < a.length; j++) {
			if(!a[j])
				list.add(j+1);
		}

		return list;
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		for (int i = 1;  i <= nums.length; i++) {
			if (!set.contains(i))
				list.add(i);
		}
		
		return list;
	}
	
	static void fairCandySwap(int[] a, int[] b) {
		int sumA = 0, sumB = 0; 
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
			sumB += b[i];
		}
		int delta = (sumB - sumA) / 2;
		
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i] + delta))
				System.out.println(a[i] + " : " + (a[i] + delta));
		}
	}
	
	static void productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		Map<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i< nums.length; i++) {
			
			hm.put(i, nums[i]);
		}
		
		System.out.println(Arrays.toString(res));
	}
	
	static boolean isMonotonic(int[] a) {
		int store = 0;
		for (int i = 0; i < a.length-1; i++) {
			int c = Integer.compare(a[i], a[i+1]);
			if (c != 0) {
				if (c != store && store != 0)
					return false;
				store = c;
			}
			
		}
		return true;
	}

	static boolean isMonotonicOptmised(int[] a) {
		int l = 0;
		int r = a.length-1;
		if (pivot(a, l, r) == -1)
			return false;
		return true;
	}

	/*
	 * Only works for increasing array
	 */
	static int pivot(int[] a, int l, int r) {
		if (l > r)
			return -1;
		if (l == r)
			return l;
		int mid = (l + r) / 2;
		
		if (mid < r && a[mid] == a[mid+1])
			mid++;
		if (l < mid && a[mid-1] == a[mid])
			mid--;

		if (mid < r && a[mid] > a[mid + 1])
			return mid;
		if (l < mid && a[mid - 1] > a[mid])
			return mid - 1;

		if (a[l] >= a[mid])
			return pivot(a, l, mid - 1);
		return pivot(a, mid + 1, r);
	}

}
