package mandatoryHomeWork.week3.day2;

import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.junit.Test;

/*Pseudo-code
 * 1. Sort the input array using Arrays.sort
 * 2. Find the min value of the sorted elements in the array and store it in diff
 * 3. Create a new array list to store the result
 * 4. Now check if the difference of the consequitive elements in the array is equal to diff
 * 5. if yes add the elements to the arraylist as List.
 * 6. return the arraylist
 * 
 * Time complexity = O(n)
 */

public class LC_1200_Minabsolutediff {
	
	@Test
	public void tc1()
	{
		int[] arr = {1,3,6,10,15};
		System.out.println(minimumAbsDifference(arr));
		
	}
	

	@Test
	public void tc2()
	{
		int[] arr = {3,8,-10,23,19,-4,-14,27};
		System.out.println(minimumAbsDifference(arr));
	}
	
	

	private List<List<Integer>> minimumAbsDifference(int[] arr) {
		 Arrays.sort(arr);

	        int diff = Integer.MAX_VALUE;
	        for(int i=0;i<arr.length-1;i++){
	            diff = Math.min(diff,arr[i+1]-arr[i]);
	        }

	        List<List<Integer>> result = new ArrayList<>();

	        for(int i=0;i<arr.length-1;i++){
	            if(arr[i+1]-arr[i]==diff){
	                result.add(Arrays.asList(arr[i], arr[i + 1]));
	            }
	        }
	        return result;
	}
	

}
