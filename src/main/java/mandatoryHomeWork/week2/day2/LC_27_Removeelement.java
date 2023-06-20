package mandatoryHomeWork.week2.day2;

import org.junit.Test;

/*Pseudo-code
 * 1. Traverse through the input array
 * 2. check if the given input value is not equal to the elements of the array
 * 3. if yes swap the position of the values using temp variable
 * 4. return the count value
 * 
 * 
 * Time complexity = O(n)
 * Space complexity = O(1)
 */

public class LC_27_Removeelement {
	
	@Test
	public void tc1()
	{
		int[] nums= {3,2,2,3};
		int val=3;
		System.out.println(removeElement(nums,val));
	}
	@Test
	public void tc2()
	{
		int[] nums= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(nums,val));
	}
	private int  removeElement(int[] nums, int val) {
		// TODO Auto-generated method stub
		int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
        
	}
	
	

}
