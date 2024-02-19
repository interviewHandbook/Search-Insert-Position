package com.interviewPrep.leetcode.easy.searchinsertposition;

public class FirstApproach {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 4;
		
		FirstApproach sip = new FirstApproach();
		int pos = sip.searchInsert(nums, target);
		
		System.out.println("Insert position: " + pos);
	}
	
	/*
	 * function to find the correct index position for given target val
	 * input array -> int[] nums = {1,3,5,6};
	 * target val -> 4
	 */
	public int searchInsert(int[] nums, int target) {
		
		// store array length as default return answer
		int val = nums.length ;
		
		/*
		 * Iterate the given array
		 */
		for(int i=0; i<nums.length; i++) {
			
			// store the current array value in var
			int curNum = nums[i];
			
			/*
			 * check if current array val is equal to or greater than target
			 */
			if(curNum == target || curNum > target) {
				
				// if yes then return this index
				val = i;

				return val;
			}
		}
		
		// else return input array length as answer
		return val;
	}
}
