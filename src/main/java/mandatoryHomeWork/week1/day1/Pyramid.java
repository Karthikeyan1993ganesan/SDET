package mandatoryHomeWork.week1.day1;

public class Pyramid {


	/**********Pseudo-code************
	 * 1. A variable with no.of rows to be declared
	 * 2. use an outer loop for the number of rows to be printed in the upper part of the pyramid
	 * 3. inside the outer loop use two inner for loops 
	 * 4. first inner loop should print the space
	 * 5. Second inner loop should print the * followed by a new line statement
	 * 6. Whole pyramid will be printed
	 */
		
	/*
	 * Time complexity = O(n^2)
	 * Space complexity =O(1)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=row-i;j>1;j--)
			{
				
				System.out.print(" ");
								
			}
			for(int j=0; j<=i;j++)
			{
			
				System.out.print("* ");	
			}
			System.out.println();
			
		}
	}

}


