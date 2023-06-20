package mandatoryHomeWork.week5.day1;

import org.junit.Test;

public class LC_925_Islongpressedname {
	
	@Test
	public void tc1()
	{
		 String name = "alex"; 
		 String typed = "aaleexa";
		 System.out.println( isLongPressedName(name,typed));
				 
	}
	
	@Test
	public void tc2()
	{
		 String name = "saeed"; 
		 String typed = "ssaaedd";
		 System.out.println( isLongPressedName(name,typed));
				 
	}
	

	    public boolean isLongPressedName(String name, String typed) {
	        int m = name.length(), n = typed.length();
	        int i = 0, j = 0;
	        
	        while(i < m && j < n){
	            char c1 = name.charAt(i), c2 = typed.charAt(j);
	            if(c1 != c2) return false; // we are handling different chars, no!
	            
				// count of consecutive c1/c2
	            int count1 = 0; 
	            while(i < m && name.charAt(i) == c1){
	            	System.out.println("inner i" +i);
		              System.out.println("inner count1" +count1);
		                System.out.println("name" +name.charAt(i));
	                count1++;
	                i++;
	               
	            }
	            
				// count of consecutive c1/c2
	            int count2 = 0; 
	            while(j < n && typed.charAt(j) == c2){
	            	 System.out.println("inner j" +j);
		              System.out.println("inner count2" +count2);
		             System.out.println("typed" +typed.charAt(j));
	                count2++;
	                j++;
	            }
	            
	            if(count2 < count1) return false;
	        }
	        
			// they both reach the end
	    
	        return i==m && j==n;
	    }
	}


