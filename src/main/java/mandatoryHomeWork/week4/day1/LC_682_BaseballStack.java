package mandatoryHomeWork.week4.day1;
import java.util.*;

/* Leetcode 682
 * Traverse through the input String array and check if the String is C
 * if Yes, then pop the value out of the stack
 * else if check if the string is D and if the stack is not empty
 * if yes, multiply the previous value with 2 and push
 * else if check if the string is + and stack size is greater than 2
 * if yes, push the sum of previous 2 values in to the stack
 * else, if the string value is a number convert the string to integer format and push it in stack
 * finally loop through the stack values and store the total sum in a variable sum
 * return sum
 * 
 * 
 * Time complexity = O(n)
 * 
 */

import org.junit.Test;

public class LC_682_BaseballStack {
	
	@Test
	public void tc1()
	{
		String[] ops = {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
		
	}
	
	@Test
	public void tc2()
	{
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));
		
	}
	
	@Test
	public void tc3()
	{
		String[] ops = {"1","C"};
		System.out.println(calPoints(ops));
		
	}
	
	
	
	public int calPoints(String[] operations) {
	    Stack<Integer> stack = new Stack<>();
	    int sum = 0;
	    for (int i = 0; i < operations.length; i++) {
	        if (operations[i].equals("C") && !stack.isEmpty()) {
	            stack.pop();
	        } else if (operations[i].equals("D") && !stack.isEmpty()) {
	            stack.push(2 * stack.peek());
	        } else if (operations[i].equals("+") && stack.size() >= 2) {
	            int temp = stack.pop();
	            int temp1 = stack.peek();
	            stack.push(temp);
	            stack.push(temp + temp1);
	        } else {
	            try {
	                stack.push(Integer.parseInt(operations[i]));
	            } catch (NumberFormatException e) {
	                // Invalid input, ignore it
	            }
	        }
	    }

	    for (int score : stack) {
	        sum += score;
	    }
	    return sum;
	}

}
