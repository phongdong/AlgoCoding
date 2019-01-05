package com.bst;

public class BrokenSlope {
	
	static void isBrokenSlope(int[] a) {
		int pivot = findPivot(a, 0, a.length-1);
		System.out.println(pivot); 
	}
	
	static int findPivot(int[] a, int l, int r) {
		if (l > r) return -1;
		if (l == r) return l;
		
		int mid = (l + r) / 2;
		if (mid < r && a[mid] > a[mid+1]) return mid;
		if (l < mid && a[mid-1] > a[mid]) return mid-1;
		
		if (a[l] >= a[mid]) return findPivot(a, l, mid-1);
		return findPivot(a, mid+1, r);
	}

	public static void main(String[] args) {
		//int[] a = {1,2,3,2,4,5,6};
		//int[] a = {1,2,3,4,5,6,7};
		int[] a= {6,5,4,3,2,1};
		isBrokenSlope(a);

	}

}
