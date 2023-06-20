package mandatoryHomeWork.week3.day1;

import org.junit.Test;

/*Pseudo-code
 * 1.Create two pointers i, j to traverse through the array using sliding window
 * 2.Check if the right pointer is less the length of the input string
 * 3.if yes, calculate the window size is equal to three
 * 4.if yes, then find the distinct substring of window size and increment the count value
 * 5.Return the count value
 * 
 * Time complexity = O(n)
 * 
 */

public class LC_1876_Substringofsizethree {
	
	@Test
	public void TC1()
	{
		String s = "xyzzaz";
		System.out.println(substr(s));
	}
	
	@Test
	public void TC2()
	{
		String s = "aababcabc";
		System.out.println(substr(s));
	}
	
	

	private int substr(String s) {
		
		        int i=0, j=0, count=0;
		        while(j<s.length()){
		            if(j-i+1==3){
		                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) 
		                && s.charAt(i+2) != s.charAt(i)){
		                    count++;
		                }
		                i++;
		            }
		            j++;
		        }
				return count;
		       
		    }
	 		
		}


