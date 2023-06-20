package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class LC_231_Poweroftwo {
	
/*********Psuedo-code***********
 1.check whether the given number is 0, if yes return as false
 2.check if input number is not equal to 1
 3.if yes, check whether the modulo of the number is not equal to 0
 4.if yes, return false
 5.else keep dividing the number until the mod we arrive at a quotient of 1 and return as true
 6.else return false
*/
	
	@Test
	public void test1()
	{
		int n=32;
		System.out.println(power(n));
	}

	private boolean power(int n) {
		
		// TODO Auto-generated method stub
		if(n==0)
		{
			return false;
		}
		
		while(n!=1)
		{
			if(n%2!=0)
			return false;
		 n=n/2;
			
		}
		return true;
		}
		}
		
		
		
	
	


