package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class Removeelementandtrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Removing an element from the array
 ********Pseudo-code***************
 1.Check whether the element to be removed is present in input array
 2.If No, add all the elements to an output array
 3.Else if the element to be removed is present in the input array, come out of the loop without adding the element to the output array
 4.Print the output array 
 */
		
/*
 * Time complexity = O(n)
 */
		int[] nums = {1,2,5,3,8};
		int numtoremove=2;
		int trimlength=2;
		int[] trimarr = new int[trimlength];
		int[] op = new int[nums.length-1];
		int j=0;
		System.out.println("Input Array: "+(Arrays.toString(nums)));
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=numtoremove)
			{
				op[j]=nums[i];
				j++;
			}
		}
		
		System.out.println("After removing the element "+numtoremove+" "+Arrays.toString(op));
		
		//Trim an array
		for(int i=0;i<trimarr.length;i++)
		{
			trimarr[i] = op[i];
			
		}
		System.out.println("Trimmed array: "+(Arrays.toString(trimarr)));

	}

}


