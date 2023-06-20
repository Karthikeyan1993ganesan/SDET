package mandatoryHomeWork.week4.day2;

import org.junit.Test;

public class LC_844_BackSpaceStringCompare {
	
	@Test
	public void tc1()
	{
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s,t));
	}
	
	@Test
	public void tc2()
	{
		 String s = "ab##";
		 String t = "c#d#";
				 
		System.out.println(backspaceCompare(s,t));
	}
	
	@Test
	public void tc3()
	{
		 String s = "a#c";
		 String t = "b";
				 
		System.out.println(backspaceCompare(s,t));
	}
	
	
	
    public boolean backspaceCompare(String S, String T) {
        return sb(S).equals(sb(T));
    }
    
    private String sb(String str) {
        StringBuilder sbr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            
            if (c != '#') {
                sbr.append(c);
            } else if (sbr.length() != 0) {
                sbr.deleteCharAt(sbr.length() - 1);
            }
        }
        return sbr.toString();
    }

}
