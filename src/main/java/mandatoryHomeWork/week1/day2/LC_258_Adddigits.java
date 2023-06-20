package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class LC_258_Adddigits {

	
		// TODO Auto-generated method stub
	
/*Pseudocode
 * 1. Find the Mod of the given integer and store the remainder in a variable
 * 2. Find the Division of the given integer and store the quotient in a variable
 * 3. Add the Remainder and Quotient we got and check  if its less than 9
 * 4. if yes, return the output
 * 5. else again do step 1 and 2 using while loop
 */
	
/*
 * Time Complexity = O(n)
 */
	@Test
		public void test1()
		{
		int num =55;
		System.out.println("Added digits:"+add(num));
			
		}
	 

		private int add(int num) {
			int sum=0,rem=0,quo=0;
			while(num > 9)
			{
				rem=num%10;
				quo=num/10;
				sum=rem+quo;
				if(sum<9)
				{
					return sum;
				}
				else
				{
				  num=sum;  
				}
			}
			
			
			
			
			return num;
			// TODO Auto-generated method stub
			
			
		}

	}


