package mandatoryHomeWork.week1.day2;

import java.util.*;

import org.junit.Test;

public class firstlastoccr {
	
/*****Pseudo-code******
 1. Create an array list and add all the elements of the input array 
 2. If we found the first occurence of the input number in the list, remove the element and break
 3. Now again If we traverse from the last element of the list and if we found the occurence of the input number
 4. Remove the element and break the loop
 */
	
/*
 * Time complexity = O(n)
 */
	
	@Test
	public void test1()
	{
	int[] nums= {1,2,1,4,1,1,1,1};
	int len=nums.length;
	int no=1;
	test2(nums,no,len);
	}

	private void test2(int[] nums, int num,int len) {
		// TODO Auto-generated method stub
	List<Integer> al = new ArrayList<Integer>();
	
	for(int i=0;i<nums.length;i++)
	{
		al.add(nums[i]);
	
	}
	
	for(int i=0;i<al.size();i++)
	{
	if(al.get(i)==num)
	{
		al.remove(i);
		break;
	}
	}
	System.out.println(al);
	int x = al.size()-1;
	for(int j=x;j>=0;j--)
	{
	if(al.get(j)==num)
	{

		al.remove(j);
		break;
	}
	
	}
	System.out.println(al);
	
	
	
	}
	
}
