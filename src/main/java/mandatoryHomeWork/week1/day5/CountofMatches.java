package mandatoryHomeWork.week1.day5;

import org.junit.Test;

/*Pseudo-code
 * 1. Check whether the input n is greater than 1 
 * 2. if yes find the div of the input number n and add it to the variable sum
 * 3. find the sum of div and mod(teams  of the given input n and store it in the input variable n
 * 4. if n=1, then exit the while loop and return the sum value
 * 
 */

/*
 * Time complexity = O(n)
 */

public class CountofMatches {
	
	@Test
	public void test1()
	{
		int n =7;
		System.out.println(countofmatches(n));
	}
	
	@Test
	public void test2()
	{
		int n =14;
		System.out.println(countofmatches(n));
	}

	private int countofmatches(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		
		while(n>1){
		   sum=sum+(n/2); 
		   n=(n/2)+(n%2);
		}
		
		return sum;		
		
	}
}
