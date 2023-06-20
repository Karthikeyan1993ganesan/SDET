package mandatoryHomeWork.week1.day4;

import org.junit.Test;

/*
 * Pseudo-code
 * 1. check the length of the input array
 * 2. Calculate the Sum of all elements in the array
 * 3. Use the arithmetic progression formula to find out the missing number 
 * 4. print the missed number
 * 
 */

/*
 * Time complexity = O(n)
 */

public class LC_268_Missednumber {
	
@Test
public void test1()
{
	int[] nums= {3,0,1};
	test(nums);
}

@Test
public void test2()
{
	int[] nums= {9,6,4,2,3,5,7,0,1};
	test(nums);
}

@Test
public void test3()
{
	int[] nums= {0,1};
	test(nums);
}

private void test(int[] nums) {
	// TODO Auto-generated method stub
	int n = nums.length;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum = sum + nums[i];
	}
	
	System.out.println("Missed number is:"+(n*(n+1)/2-sum));
		
		
	}
	
}



