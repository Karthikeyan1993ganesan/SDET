package mandatoryHomeWork.week1.day1;

import java.util.*;

import org.junit.jupiter.api.Test;

public class LC_66_Plusone {

	
		
		
		/*PlusOne
		 *********Pseudo-code**************
		 1. Traverse through the array from the last index
		 2. if the last index value is less than 9, then add +1 to the last element
		 3. else assign 0 to the last element and 
		 4. If all the elements are 9, add 0 to the first index of the array
		 */
	
	/*
	 * Time Complexity = O(n)
	 */

		@Test
		public void temp()
		{
			int[] nums= {9,9,9,9};
			System.out.println(Arrays.toString(plusonee(nums)));
		}
		public int[] plusonee(int[] nums) {
				// TODO Auto-generated method stub
				for(int i=nums.length-1;i>=0;i--)
				{
					if(nums[i]<9)
					{
						nums[i]=nums[i]+1;
						return nums;
					}
					else
					nums[i]=0;
				}
				nums =new int[nums.length+1];
				System.out.println(Arrays.toString(nums));
				nums[0]=1;
				return nums;
			}

		

	}


