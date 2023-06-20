package mandatoryHomeWork.week5.day1;

import org.junit.Test;

public class LC_1700_NoofstudentunabletoEat {
	
	@Test
	public void tc1()
	{
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		 System.out.println( countStudents(students,sandwiches));
				 
	}
	
	@Test
	public void tc2()
	{
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		 System.out.println( countStudents(students,sandwiches));
				 
	}
	
	    public int countStudents(int[] students, int[] sandwiches) {
	        int ones = 0; //count of students who prefer type1
	        int zeros = 0; //count of students who prefer type0
			
	        for(int stud : students){
	            if(stud == 0) zeros++;
	            else ones++;
	        }
	        
	        // for each sandwich in sandwiches
	        for(int sandwich : sandwiches){
	            if(sandwich == 0){  // if sandwich is of type0
	                if(zeros == 0){ // if no student want a type0 sandwich
	                    return ones;
	                }
	                zeros--;
	            }
	            else{  // if sandwich is of type1
	                if(ones == 0){  // if no student want a type1 sandwich 
	                    return zeros;
	                }
	                ones--;
	            }
	        }
	        return 0;
	    }
	}


