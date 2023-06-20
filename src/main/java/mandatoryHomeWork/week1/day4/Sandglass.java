package mandatoryHomeWork.week1.day4;

public class Sandglass {

	
	/**********Pseudo-code************
	 * 1. A variable with no.of rows to be declared
	 * 2. use an outer loop for the number of rows to be printed in the upper part of the sandglass
	 * 3. inside the outer loop use two inner for loops one for the space and the other for the * to be printed
	 * 4. similarly, use an other outer loop for the lower sandglass part
	 * 5. Have two inner loops one for the space and the other for the * to be printed
	 * 6. Whole sandglass will be printed
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
			
			for(int j=row;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			int x=0;
			for(int k=i;k>=x;x++)
			{
				if(k==4)
				break;
				System.out.print(" ");
			}	
			
		}
		//System.out.println();
		int y=row-1;
		for(int i=0;i<row;i++)
		{
			for(int k=y;k>i;k--)
			{
				System.out.print(" ");
				//System.out.print("$");
			}
			
			
			
			int z=0;
			for(int j=i;j>=z;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
