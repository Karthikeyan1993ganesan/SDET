package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class Arrayoperations {

	/*Add element in an array to a specific index		
	******Pseudo-code******
	1.Check if the array elements are less than the number to be inserted
	2.If yes add the input array elements to an output array
	3.Else break the loop and insert the new value to the current index of the output array
	4.And add the remaining elements to the output array
	5.print the output array
	*/	
			
	/*
	 * Time complexity = O(n)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int[] nums = {4,5,7};
		int[] op = new int[nums.length+1];
		int notoinsert=6;
		int i=0;

		for(;i<nums.length;i++)
		{
			if(nums[i]<notoinsert)
			{
				op[i]=nums[i];
			}
			else
				break;
		}
		op[i]=notoinsert;
		for(;i<nums.length;i++)
		{
			op[i+1]=nums[i];
		}
		for(int j=0;j<op.length;j++)
		{
			System.out.println("Element at index "+j+" of output array is:"+op[j]);
			
		}
		System.out.println();



		
/*Check if the array contains the number inserted(notoinsert=6)
**********Pseudo-code************
1.Traverse through the array based on length
2.check whether any of the element is equal to the number inserted in the array
3.If Yes, Print the index
4.Else print that the element is not present

*/
		for(int k=0;k<op.length;k++)
		{
			if(op[k]==67)	
			{
				System.out.println("Output array contains "+op[k]+" at index "+k);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Element not present in Array");
		}
		
		
		
		
/* print the array as a string
**********Pseudo-code********
1. Use the Arrays.toString to print the int array as string
*/
		System.out.println();
		System.out.println("Printing array as a string"+(Arrays.toString(op)));
		
		

	}

}


