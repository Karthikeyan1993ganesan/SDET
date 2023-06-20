package mandatoryHomeWork.week4.day5;

import org.junit.Test;
import java.util.Stack;

public class LC_1598_CrawlerLogFolder {
	
	@Test
	public void tc1()
	{
		String[] logs = {"d1/","d2/","../","d21/","./"}; 
		System.out.println(minOperations(logs));
	}
	
	@Test
	public void tc2()
	{
		String[] logs = {"d1/","d2/","./","d3/","../","d31/"}; 
		System.out.println(minOperations(logs));
	}
	
	@Test
	public void tc3()
	{
		String[] logs = {"d1/","../","../","../"}; 
		System.out.println(minOperations(logs));
	}
	
	
	
	    public int minOperations(String[] logs) {
	         var stack = new Stack<String>();
	        for(var log : logs){
	            if(log.equals("../")){
	                if(!stack.empty())
	                    stack.pop();
	            }else if(log.equals("./")){

	            }else{
	                stack.push(log);
	            }
	        }
	        return stack.size();
	    }
	}


