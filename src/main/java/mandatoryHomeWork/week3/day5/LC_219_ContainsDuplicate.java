package mandatoryHomeWork.week3.day5;

import java.util.*;

import org.junit.Test;


/*Pseudo-code
 * 1. Create a set 
 * 2. Traverse through the elements and remove element if its distance to nums[i] is not lesser than k
 * 3. check all still existed elements is closer than k distance to the num[i], 
 * 4. therefore if the add() return false, 
 * 5. it means there's a same value element already existed within the distance k, therefore return true.
 * 
 * Time complexity = O(n)
 * 
 * 
 */
public class LC_219_ContainsDuplicate {
	
	@Test
	public void tc1()
	{
		int[] nums = {1,2,3,1};
		int k=3;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	@Test
	public void tc2()
	{
		int[] nums = {1,0,1,1};
		int k=1;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	
	@Test
	public void tc3()
	{
		int[] nums = {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }

}
