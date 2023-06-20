package mandatoryHomeWork.week3.day3;
import java.util.*;

import org.junit.Test;

/*Pseudo-code
 * 1. Store the given string and int array in a hashmap with heights as key and names as values
 * 2. Sort the heights array
 * 3. Now, fetch the corresponding values of the height from the map in descending order using for loop
 * 4. return the string array 
 * 
 * Time complexity = O(n)
 */



public class LC_2418_Sortthepeople {
	
	@Test
	public void tc1()
	{
		String[] names = {"Mary","John","Emma"};
		int[] heights= {180,165,170};
		System.out.println(Arrays.toString(sortPeople(names,heights)));
	}
	
	@Test
	public void tc2()
	{
		String[] names = {"Alice","Bob","Bob"};
		int[] heights= {155,185,150};
		System.out.println(Arrays.toString(sortPeople(names,heights)));
	}
	
	public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer,String> map=new HashMap<>();
        for(int i=0; i<names.length ;i++){
             map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[heights.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[j]=map.get(heights[i]);
            j++;
        }
        return ans;
    }

}
