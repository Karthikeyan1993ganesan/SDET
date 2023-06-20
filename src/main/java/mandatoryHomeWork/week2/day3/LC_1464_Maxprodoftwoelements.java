package mandatoryHomeWork.week2.day3;

import org.junit.Test;

/*pseudo-code
 * 1. Initialize two variables max1 and max2 to find the max values in the input array
 * 2. Traverse through the array and find out the max1 and max2 values 
 * 3. calculate the product of max1 and max2 after decrementing one from each
 * 4. return the product
 * 
 * Time complexity = O(n)
 * Sapce complexity = O(1)
 */

public class LC_1464_Maxprodoftwoelements {

	@Test
	public void tc1()
	{
		int[] nums= {3,4,5,2};
	
		System.out.println(maxProduct(nums));
	}
	@Test
	public void tc2()
	{
		int[] nums= {1,5,4,5};
		
		System.out.println(maxProduct(nums));
	}
	
	
	
	
	public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int result = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
            }
        
            else if(nums[i]>max2){
                max2 = nums[i];
            }
            result = (max1-1)*(max2-1);
        }
        return result;
    }
}
