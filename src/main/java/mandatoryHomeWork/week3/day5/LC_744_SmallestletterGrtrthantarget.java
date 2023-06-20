package mandatoryHomeWork.week3.day5;

import org.junit.Test;

/*Pseudo-code
 * 1. Initialize the start and end pointers
 * 2. check if start is less than or equal to end
 * 3. if yes calculate the mid value
 * 4. check if mid is equal to target, if yes then increment start as mid+1
 * 5. else if target is greater than mid then, increment start as mid+1
 * 6. else if the mid is greater than target then assign the mid as result and reduce end by 1
 * 7. finally return the result
 * 
 *  
 *  Time complexity = O(logn)
 *  Space complexity = O(1)
 */

public class LC_744_SmallestletterGrtrthantarget {
	
	
	@Test
	public void tc1()
	{
		char[] letters = {'c','f','j'};
		char target = 'a';
		System.out.println(nextGreatestLetter(letters,target));
		}
	
	@Test
	public void tc2()
	{
		char[] letters = {'c','f','j'};
		char target = 'c';
		System.out.println(nextGreatestLetter(letters,target));
		}
	
	@Test
	public void tc3()
	{
		char[] letters = {'x','x','y','y'};
		char target = 'z';
		System.out.println(nextGreatestLetter(letters,target));
		}
	
	public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]==target)
            {
                start=mid+1;
            }
            else if(target>letters[mid])
            {
                start=mid+1;
            }
            else if(letters[mid]>target)
            {
                res=letters[mid];
                end=mid-1;
            }
        }
        return res;
        
    }

}
