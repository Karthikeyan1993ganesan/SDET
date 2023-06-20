package mandatoryHomeWork.week4.day3;
import java.util.ArrayDeque;

import org.junit.Test;

public class LC_1047_RemoveAllAdjacentDuplicates {
	
	
	@Test
	public void tc1()
	{
		String s = "abbaca"; 
		System.out.println(removeDuplicates(s));
	}
	
	@Test
	public void tc2()
	{
		String s = "azxxzy";  
		System.out.println(removeDuplicates(s));
	}
	
	
    public String removeDuplicates(String S) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (char c : S.toCharArray()) {
            if (!dq.isEmpty() && dq.peekLast() == c) { 
                dq.pollLast();
            }else {
                dq.offer(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : dq) { sb.append(c); }
        return sb.toString();
    }

}
