package mandatoryHomeWork.week2.day4;

import org.junit.Test;

/*Pseudo-code
 * 1. Traverse through the input String array
 * 2. check each character whether it is equal to the given input ch character
 * 3. if yes, find the substring of the string till the character ch
 * 4. reverse the string until the input char ch using string builder methods
 * 5. append the reversed string to the original input string
 * 6. pring the new string
 * 
 * Time complexity = O(n)
 */

public class LC_2000_ReversePrefixofword {
	
	@Test
	public void TC1()
	{
		String word="abcdefd";
		char ch='d';
		System.out.println(revprefixofword(word,ch));
	}
	
	@Test
	public void TC2()
	{
		String word="xyxzxe";
		char ch='z';
		System.out.println(revprefixofword(word,ch));
	}
	
	@Test
	public void TC3()
	{
		String word="abcd";
		char ch='z';
		System.out.println(revprefixofword(word,ch));
	}

	private String revprefixofword(String word, char ch) {
		// TODO Auto-generated method stub
		String str="";
		for(int i=0;i<word.length();i++)
		{
			char ch1=word.charAt(i);
			if(ch1==ch)
			{
				String temp = word.substring(0,i+1);
				temp = new StringBuilder(temp).reverse().toString();
				str=temp+word.substring(i+1,word.length());
				break;
			}
		
	}
return str;
}
	
}
