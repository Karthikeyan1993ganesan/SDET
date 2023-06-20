package mandatoryHomeWork.week4.day4;

import org.junit.Test;

public class LC_1544_MaketheStringGreat {
	
	
	@Test
	public void tc1()
	{
		String s = "leEeetcode"; 
		System.out.println(makeGood(s));
	}
	
	@Test
	public void tc2()
	{
		String s = "abBAcC";  
		System.out.println(makeGood(s));
	}
	
	@Test
	public void tc3()
	{
		String s = "s"; 
		System.out.println(makeGood(s));
	}

		 public String makeGood(String s) {
	        for (int i = 0; i < s.length() - 1; i++) {
	            //Now we check if the either the present or the next character is capital
	            if (Math.abs(s.charAt(i) - s.charAt(i+1)) == 32) {  
	                //recursive call for the rest of the string
	            	System.out.println("hi"+s.substring(0, i));
	            	System.out.println("hi"+s.substring(i+2));
	                return makeGood(s.substring(0, i) + s.substring(i+2));
	                
	            }
	        }     
	        return s;
	    }
	}


