package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class LC_392_IsSubSequence {
	
	@Test
	public void tc1()
	{
		 String s = "abc"; 
		 String t = "ahbgdc";
		 System.out.println( isSubsequence(s,t));
				 
	}
	
	@Test
	public void tc2()
	{
		 String s = "axc"; 
		 String t = "ahbgdc";
		 System.out.println( isSubsequence(s,t));
				 
	}
	
	
	    public boolean isSubsequence(String s, String t) {
	  
	    int i=0,j=0;
	    int n=t.length();
	    int m=s.length();
	    char ss[]=s.toCharArray();
	    char tt[]=t.toCharArray();

	    if(m<1)
	        return true;

	    while(i<n){
	        if(tt[i]==ss[j]){
	            j++;
	        }
	        i++;
	        
	    if(j==m)
	        return true;
	    }

	        return false;
	    }
	}


