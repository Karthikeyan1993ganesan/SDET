package mandatoryHomeWork.week3.day1;

import org.junit.Test;

/*pseudo-code
 * 1. Create two pointers i and j to slide through the array
 * 2. check if the right pointer is less than the length
 * 3. if yes, add the elements of the array to a variable sum
 * 4. check whether the difference between two pointers +1 is less than the window size
 * 5. if yes, increment the right pointer
 * 6. else, check if it is equal to the window size
 * 7. if yes, calculate the max value 
 * 8. find the difference between the sum value and nums[i]
 * 9. increment the right and left pointer by 1
 * 10.Return the average of max value in double format
 * 
 * Time complexity = O(n)
 */

public class LC_643_Maxavgsubarray {

	@Test
	public void TC1()
	{
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(findMaxAverage(nums,k));
	}
	
	@Test
	public void TC2()
	{
		int[] nums = {5};
		int k = 1;
		System.out.println(findMaxAverage(nums,k));
	}
	public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        
        int max=Integer.MIN_VALUE;

        int i=0;
        int j=0;
        
        while(j<nums.length){
            sum+=nums[j];
            //System.out.println(sum);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-nums[i];
                System.out.println(sum);
                i++;
                j++;
                
            }
        }
        return (double)max/k;
    }
}
