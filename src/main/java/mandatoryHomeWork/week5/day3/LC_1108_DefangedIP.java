package mandatoryHomeWork.week5.day3;

import org.junit.Test;


/*Pseudo-code
 * 1. Convert the input string to a Char array
 * 2. Iterate through the char array and check if each character is equal to '.'
 * 3. If yes, modify it with '[.]' and add it in a string
 * 4. else add the element to the string
 * 5. Pring the string value
 */

/*
 * Time complexity = O(n)
 */

public class LC_1108_DefangedIP {
	
	@Test
	public void test1()
	{
		String input="1.1.1.1";
		strrep(input);
	}

	private void strrep(String input) {
		// TODO Auto-generated method stub
		char[] a= new char[input.length()];
		String op="";
		for(int i=0;i<input.length();i++)
		{
		  a[i]=input.charAt(i);
		  
		}
		for(int j=0;j<input.length();j++)
		{
		  if(a[j]=='.')
		  {
			  op=op+"[.]";
			  
		  }
		  else
		  {
			  op=op+input.charAt(j);
			  
		  }
		 
		  
		}
		System.out.println(op);
		
	}

}
