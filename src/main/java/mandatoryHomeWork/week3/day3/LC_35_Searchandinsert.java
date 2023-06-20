package mandatoryHomeWork.week3.day3;

import org.junit.Test;


/*Pseudo-code
 * 1.Create two pointers, left with starting inde and right with input array length
 * 2.if left is less than right 
 * 3.calculate the mid of the input array
 * 4.check if the mid value is greater than the target
 * 5.if yes, decrement the right pointer by 1
 * 6.else if, check mid value is lesser than the target
 * 7.if yes increment the left pointer by 1
 * 8.else return the mid value
 * 9.finally return the left value
 * 
 * 
 * Time complexity = O(log n)
 */
public class LC_35_Searchandinsert {
	
	@Test
	public void tc1()
	{
		int[] nums= {1,3,5,6};
		int target=5;
		System.out.println(searchInsert(nums,target));
		
	}
	
	@Test
	public void tc2()
	{
		int[] nums= {1,3,5,6};
		int target=2;
		System.out.println(searchInsert(nums,target));
		
	}
	
	@Test
	public void tc3()
	{
		int[] nums= {1,3,5,6};
		int target=7;
		System.out.println(searchInsert(nums,target));
		
	}
	
	
public int searchInsert(int[] nums, int target) {
        
        int left= 0;
        int right= nums.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]> target){
                right= mid-1;
            }else if(nums[mid]< target){
                left= mid+1;
            }else return mid;
        }
        return left;
    }

}
