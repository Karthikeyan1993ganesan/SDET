package mandatoryHomeWork.week2.day2;

import org.junit.Test;

/*Pseudo-code
 * 1. Initialize an empty string to store the merged result.
   2. Traverse both input strings together, picking each character alternately from both strings and appending it to the merged result string.
   3. Continue the traversal until the end of the longer string is reached.
   4. Return the merged result string.
   
   Time complexity = O(n)
   Space complexity = O(n)
 */

public class LC_1768_MergeStringsalternate {
	@Test
	public void tc1()
	{
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeAlternately(word1,word2));
	}
	
	@Test
	public void tc2()
	{
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(mergeAlternately(word1,word2));
	}
	
	@Test
	public void tc3()
	{
		String word1 = "abcd";
		String word2 = "pq";
		System.out.println(mergeAlternately(word1,word2));
	}


		public String mergeAlternately(String word1, String word2) {
	        StringBuilder result = new StringBuilder();
	        int i = 0;
	        while (i < word1.length() || i < word2.length()) {
	            if (i < word1.length()) {
	                result.append(word1.charAt(i));
	            }
	            if (i < word2.length()) {
	                result.append(word2.charAt(i));
	            }
	            i++;
	        }
	        return result.toString();
	    }
}
