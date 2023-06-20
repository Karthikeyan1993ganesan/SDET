package mandatoryHomeWork.week3.day3;

import java.util.Arrays;

import org.junit.Test;

/*Pseudo-code
 * 1. if the input k value is 1 then return 0
 * 2. Sort the input nums array
 * 3. Traverse through the nums array and calculate the min value by comparing the difference of the elements
 * 4. Return the min value
 * 
 * Time complexity = O(nlogn)
 * Space complexity = O(1)
 */

public class LC_1984_MindiffbtwHeighestandLowest {
	
	@Test
	public void tc1()
	{
		int[] nums = {90};
		int k=1;
		System.out.println(minimumDifference(nums,k));
	}
	
	@Test
	public void tc2()
	{
		int[] nums = {9,4,1,7};
		int k=2;
		System.out.println(minimumDifference(nums,k));
	}
	
	 public int minimumDifference(int[] nums, int k) {
	        if (k == 1) return 0;

	        Arrays.sort(nums);
			
	        int i = 0, j = k - 1, 
	        min = Integer.MAX_VALUE;

	        while (j < nums.length) {
	            min = Math.min(min, nums[j++] - nums[i++]);
	        }

	        return min;
	    }

}
