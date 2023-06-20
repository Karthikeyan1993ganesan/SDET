package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

/*pseudo-code
 * 1. Initialize three pointers p1(with last index of nums1) p2(with last index of nums2) and p with (nums1.length + nums2.length -1)
 * 2. check while p1 and p2 are greater than 0
 * 3. if yes compare the elements of nums1 and nums2 and store the values in nums1
 * 4. return the nums1 array
 * 
 * Time complexity = O(m+n)
 * Space complexity = O(1)
 */

public class LC_88_MergeSortedarray {
	
	@Test
	public void tc1()
	{
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m=3;
		int n =3;
		merge(nums1,m,nums2,n);
	}
	@Test
	public void tc2()
	{
		int[] nums1 = {1};
		int[] nums2 = {};
		int m=1;
		int n =0;
		merge(nums1,m,nums2,n);
	}
	
	@Test
	public void tc3()
	{
		int[] nums1 = {0};
		int[] nums2 = {1};
		int m=0;
		int n =1;
		merge(nums1,m,nums2,n);
	}
	
	
	
	
		public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int p1 = m - 1;
	        int p2 = n - 1;
	        int p = m + n - 1;
	        
	       while(p1>=0 && p2>=0)
	       {
	    	   if(nums1[p1] > nums2[p2])
	    	   {
	    		   nums1[p] = nums1[p1];
	    	   	   p1--;
	    	   	   p--;
	       }
	       else
	       {
	    	   nums1[p]=nums2[p2];
	    	   p2--;
	    	   p--;
	       }
		}
	       while(p2>=0)
	       {
	    	   nums1[p]=nums2[p2];
	    	   p2--;
	    	   p--;
	       }
	       
	       System.out.println(Arrays.toString(nums1));

}
		
}
