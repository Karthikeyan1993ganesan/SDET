package mandatoryHomeWork.week3.day2;

import org.junit.Test;

/*Pseudo-code
 * 1. Create i and j to traverse through the input array
 * 2. Check whether the i is less than length of the string blocks
 * 3. if yes, traverse through the string characters, if the character is equal to W then increment the count value
 * 4. if the i-j+1 is equal to k value,then find the min value as max
 * 5. if the character is equal to W, decrement the count value 
 * 6. increment i and j 
 * 7. return the max value
 * 
 * Time complexity = O(n)
 */

public class LC_2379_Minrecolorstogetk {
	
	@Test
	public void tc1()
	{
		 String blocks = "WBBWWBBWBW";
		 int k = 7;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	@Test
	public void tc2()
	{
		 String blocks = "WBWBBBW";
		 int k = 2;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	
	    public int minimumRecolors(String blocks, int k) {
	        int i=0,j=0,count=0;
	        int max=Integer.MAX_VALUE;
	        while(i<blocks.length()){
	            if(blocks.charAt(i)=='W') count++;
	            if(i-j+1==k){
	                max=Math.min(count,max);
	                if(blocks.charAt(j)=='W') count--;
	                j++;
	                System.out.println("max value is"+max);
	                System.out.println("i value is"+i);
	                System.out.println("j value is"+j);
	                System.out.println("count value is"+count);
	            }
	             i++;
	           
	        }
	        return max;
	    }
	}


