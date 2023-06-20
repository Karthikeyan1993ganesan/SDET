package mandatoryHomeWork.week1.day3;

/**********Pseudo-code************
 * 1. A variable with no.of rows to be declared
 * 2. use an outer loop for the number of rows to be printed in the upper part of the triangle
 * 3. inside the outer loop use one inner for loop for the * to be printed
 * 4. similarly, use an other outer loop for the lower triangle part
 * 5. Have ond inner loop for the * to be printed
 * 6. Whole pascal triangle will be printed
 */
	


/*
 * Time complexity = O(n^2)
 * Space complexity =O(1)
 */

public class Pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=0;i<row;i++)
		{
			for(int j=i+1;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
