package mandatoryHomeWork.week3.day5;

import org.junit.Test;


/*Pseudo-code
 * 1. Assume that the nums[0] is the major element 
 * 2. check if the count is 0, then assign nums[i] as major element and increment count value
 * 3. else check if major is equal to nums[i]. 
 * 4. if yes increment the count value
 * 5. else decrement the count value
 * 6. return the major element
 * 
 * Time complexity = O(n)
 * Space complexity = O(1)
 * 
 */

public class LC_169_MajorityElement {
	
	@Test
	public void tc1()
	{
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}
	
	@Test
	public void tc2()
	{
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
    public int majorityElement(int[] nums) {
        int major=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                major=nums[i];
                count++;
            }
            else if(major==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}

