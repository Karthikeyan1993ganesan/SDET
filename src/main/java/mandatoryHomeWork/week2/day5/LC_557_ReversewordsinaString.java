package mandatoryHomeWork.week2.day5;

/*Pseudo-code
 * 1. Convert the input String to a Char array
 * 2. Traverse through the input array and check if the end pointer is equal to char length or space
 * 3. if yes reverse that particular word using a reverse function 
 * 4. And increment the start pointer to the next character
 * 5. Return the entire reversed string
 * 
 * 
 * Time complexity = O(n)
 * Space complexity = O(1)
 */

public class LC_557_ReversewordsinaString {

	
	 public String reverseWords(String s) {
	        
	        char[] chars = s.toCharArray();

	        int start = 0;
	        int end;
	        for (end = 0; end <= chars.length; end++) {
	            
	            if (end == chars.length || chars[end] == ' ') {
	                reverse(chars, start, end - 1);
	    
	                start = end + 1;
	            }
	        }

	        return new String(chars);
	    }

	   
	    private void reverse(char[] c, int start, int end) {
	        while (start < end) {
	            char tmp = c[end];
	            c[end] = c[start];
	            c[start] = tmp;
	            start++;
	            end--;
	        }
	    }
}
