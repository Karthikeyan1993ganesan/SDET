package mandatoryHomeWork.week1.day3;

import java.util.Arrays;

public class Indextoremove {
	
/*********Pseudo-code*****
 * 1. check the no.of times the value to be removed is present in the array
 * 2. if yes increment the count value
 * 3. create an output array of size inputarray.length - count
 * 4. Now if input array element is not equal to the number to be removed, add the elements to the output array
 * 5. print the array
 * @param args
 */

/*
 * Time complexity = O(n)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {1,2,1,4,1,5};
		int index=1,count=0;
		
		for(int k=0;k<inp.length;k++)
		{
		if(inp[k]==inp[index])
		{
			count=count+1;
		}
		}
		int len = inp.length-count;
		int[] arr=new int[len];
		int k=0;
		for(int i=0;i<inp.length;i++)
		{
			
			if(inp[i]!=inp[index])
			{
				
				arr[k]=inp[i];
				k++;
			
			}
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}


