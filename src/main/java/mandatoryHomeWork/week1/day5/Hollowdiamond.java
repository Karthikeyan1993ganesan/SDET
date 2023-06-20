package mandatoryHomeWork.week1.day5;


/**********Pseudo-code************

 * 1. A variable with no.of rows to be declared
 * 2. use an outer loop for the number of rows to be printed in the upper part of the hollow diamond
 * 3. inside the outer loop use two inner for loops one for the space and the other for the alphabet to be printed
 * 4. similarly, use an other outer loop for the lower diamond part
 * 5. Have two inner loops one for the space and the other for the alphabet 
 * 6. Hollow Diamond will be printed
 */
	
/*
 * Time complexity = O(n^2)
 * Space complexity =O(1)
 */

public class Hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows=6;
    int alphabet=64;
    for(int i=1; i<=rows; i++)  
    {  
    for(int j=rows; j>i; j--)  
    {       
    System.out.print(" ");  
    }  
    System.out.print((char) (alphabet + i));  
    for(int j=1; j<(i-1)*2; j++)  
    {      
    System.out.print(" ");  
    }  
    if(i==1)  
    {       
    System.out.print("\n");  
    }  
    else  
    {          
    System.out.print((char) (alphabet + i)+"\n");  
    }  
    }    
    //prints lower section of the pattern  
    for(int i=rows-1; i>=1; i--)  
    {  
    for(int j=rows; j>i; j--)  
    {         
    System.out.print(" ");  
    }  
    System.out.print((char) (alphabet + i));  
    for(int j=1; j<(i-1)*2; j++)  
    {      
    System.out.print(" ");  
    }  
    if(i==1)  
    {           
    System.out.print("\n");  
    }  
    else  
    {       
    System.out.print((char) (alphabet + i)+"\n");  
    }   
	}

}
}
