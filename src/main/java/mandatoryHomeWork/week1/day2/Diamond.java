package mandatoryHomeWork.week1.day2;

public class Diamond {

/**********Pseudo-code************
 * 1. A variable with no.of rows to be declared
 * 2. use an outer loop for the number of rows to be printed in the upper part of the diamond
 * 3. inside the outer loop use two inner for loops one for the space and the other for the * to be printed
 * 4. similarly, use an other outer loop for the lower diamond part
 * 5. Have two inner loops one for the space and the other for the * 
 * 6. Whole Diamond will be printed
 */
	
/*
 * Time complexity = O(n^2)
 * Space complexity =O(1)
 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5,x=1;
		x=row-1;
		for(int i=1;i<=row;i++)
		{			
			for(int j=1;j<=x;j++)
			{			
				System.out.print(" "); //to print spaces in each row							
			}
			x--;
			for(int j=1; j<=2*i-1;j++)
			{	
				System.out.print("*");	//to print * in each row
			}
			
			
			System.out.println(); // to move to new line after each row	
			
		}x=1;
		
		for(int i=1;i<=5-1;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print(" ");
				
			}
			x++;
			for(int k=1;k<=2*(5-i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			}
		}
	

}
