
package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;



public class LC_283_Movezeroes {
	
	@Test
	public void TC1()
	{
		int[] nums = {0,1,0,3,12}; 
		System.out.println(Arrays.toString(movezero(nums)));
	}
	
	@Test
	public void TC2()
	{
		int[] nums= {0};
		System.out.println(Arrays.toString(movezero(nums)));
	}

	private int[] movezero(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int L=0,R=1;
		if(n<2)
		{
			return nums;
		}
		while(R<n)
		{
			//{0,1,0,3,12}; 
			if(nums[L]!=0)
			{
				L++;
				R++;
				
			}else if (nums[R]==0)
			{
				R++;
			}
			else
			{
				int temp=nums[R];
				nums[R]=nums[L];
				nums[L]=temp;
			}
		}
		return nums;
		
		
		
	}

}
