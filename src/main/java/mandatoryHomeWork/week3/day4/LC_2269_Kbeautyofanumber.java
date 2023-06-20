package mandatoryHomeWork.week3.day4;

import org.junit.Test;


/*Pseudo-code
 * 1. covert input integer to String
 * 2. decide the starting of the window using for loop
 * 3. Store the substring till window length
 * 4. convert the string to an integer n1
 * 5. check if input num is divisible by n1
 * 6. if yes increment the count value and return the count finally
 * 
 * 
 * Time complextiy = O(n)
 */

public class LC_2269_Kbeautyofanumber {

	
	@Test
	public void test1()
	{
		int num=240,k=2;
		System.out.println(divisorSubstrings(num,k));
	}
	
	@Test
	public void test2()
	{
		int num=430043,k=2;
		System.out.println(divisorSubstrings(num,k));
	}
	
	
	public int divisorSubstrings(int num, int k) {
        String str=String.valueOf(num); 
        int count=0;   // count of ans..
        for(int i=0;i<str.length()-k+1;i++) 
        {
            String temp=str.substring(i,i+k);    
            int n1=Integer.valueOf(temp);      
            if(n1==0)   
            {
                continue;
            }
            if(num%n1==0)      
            {
                count++;
            }
        }
        return count; 
        
    }

}
