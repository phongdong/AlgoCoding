package com.refresher;

public class ArrayUtil {
	
	public boolean isCreasing(int[] nums) {
		boolean isUp = nums[0] <= nums[1];
		boolean flag = false;
		
		for (int i=1; i < nums.length - 1; i++) {
			flag = nums[i] <= nums[i+1];
			if (flag != isUp)
				return false;
		}
		return true;
	}
}
