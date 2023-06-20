package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;


/*Pseudo-code
 * 1. Iterate through the input array using two pointers l and r
 * 2. if the Mod of each element in the array is equal to 0, then assign the element to a new array from the left pointer
 * 3. else assign the element from the right pointer
 * 4. Print the output array
 * 
 * Time complexity = O(n)
 */

public class LC_905_Sortarraybyparity {
	@Test
	public void TC1()
	{
		int[] nums = {3,1,2,4};
		System.out.println(Arrays.toString(sortarrbyparity(nums)));
	}

	@Test
	public void TC2()
	{
		int[] nums = {0};
		System.out.println(Arrays.toString(sortarrbyparity(nums)));
	}
	private int[] sortarrbyparity(int[] nums) {
		// TODO Auto-generated method stub
		int[] n = new int[nums.length];
		int l=0;
		int r=nums.length-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0)
			{
				n[l++]=nums[i];}
				else {
				n[r--]=nums[i];}
			}
			return n;
		}
}
	

