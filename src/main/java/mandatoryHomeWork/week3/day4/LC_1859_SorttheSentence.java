package mandatoryHomeWork.week3.day4;

import org.junit.Test;

/*Pseudo-code
 * 1. Convert the string to a String array
 * 2. Split the string array with space as condition
 * 3. Traverse through the array and fetch the int value at the end of each word and store it in a variable
 * 4. Now fetch the corresponding substrings except the number and store it in a array
 * 5. append the words to a string builder
 * 6. convert stringbuilder to string and return the string
 * 
 * 
 */

public class LC_1859_SorttheSentence {
	
	@Test
	public void tc1()
	{
		String s ="is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
		
	}
	
	
	@Test
	public void tc2()
	{
		String s ="Myself2 Me1 I4 and3";
		System.out.println(sortSentence(s));
		
	}

	
	
public String sortSentence(String s) {
        
        String[] arr1= s.split(" ");
        String arr[]=new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            int j=arr1[i].charAt(arr1[i].length()-1)-'0';
            arr[j-1]=arr1[i].substring(0,arr1[i].length()-1);
        }
        StringBuilder s1= new StringBuilder();
        for(int i=0; i<arr.length; i++){
            s1.append(arr[i]+ " ");
        }
        return s1.toString().trim();
    }
}
