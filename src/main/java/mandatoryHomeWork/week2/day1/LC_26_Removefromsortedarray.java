package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

/*Pseudo-code
 * 1. create left and right pointers to traverse throught the input array
 * 2. if both and left and right index values are equal, assign the element to the output array
 * 3. else if the elements of left and right pointers are not equal and also if right is not at the end of the array 
 * 	  assign the right pointer element to the output array
 * 4. else if right pointer is equal to the last index of the array, assign the right pointer
 * 	  element to the output array
 * 5. else increment the right pointer by 1
 * 6. print the count of distinct elements in the output array
 */

public class LC_26_Removefromsortedarray {
	@Test
	public void tc1()
	{
		int[] nums = {1,1,2,2,2,3};
		//System.out.println(removeDuplicates(nums));
		int k = removeDuplicates(nums);
		System.out.println(k);
		
	
	}

	 public int removeDuplicates(int[] nums) {
	        
	        int[] expectedNums = new int[nums.length];
	        int left=0,right=0,i=0;
	        int count=0;
	        while(i<nums.length)
	        {
	        	
	        	if(left==right)
	        	{
	        		expectedNums[i]=nums[left];
	        		right++;
	        		i++;
	        		
	        	}
	        	else if(nums[left]!=nums[right] && right!=nums.length-1)
	        	{
	        		expectedNums[i]=nums[right];
	        		left=right;
	        		right++;
	        		i++;
	        		
	        	}
	        	else if(right==nums.length-1)
	        		{
	        			expectedNums[i]=nums[right];
	        			break;
	        		}
	        	else
	        	{
	        		right++;
	        		
	        	}
	        	
	        	
	        }
	        
	        for(int k=0;k<nums.length;k++)
	        {
	        	if(expectedNums[k]!=0)
	        	{
	        		
	        		count++;
	        	}
	        	
	        }
	        System.out.println(Arrays.toString(expectedNums));
			return count;
	 }
}