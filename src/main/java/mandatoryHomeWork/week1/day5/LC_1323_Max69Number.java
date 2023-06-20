package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class LC_1323_Max69Number {
	
		
		/**
		 * TC -O(n) 
		 * SC -O(1)
		 * 
		 * Pseudo code:
		 *convert int to string to char array  
		 * for loop - if i = 6 convert to 9 and break 
		 * convert the char array to string and return as int
		 */
		
		@Test
		public void TC1() {
			int num = 6699;
			System.out.println(maximum69Number(num));
		}
		
		@Test
		public void TC2() {
			int num = 9996;
			System.out.println(maximum69Number(num));
		}
		
		@Test
		public void TC3() {
			int num = 9999;
			System.out.println(maximum69Number(num));
		}
		

		
		public int maximum69Number (int num) {
			
			int max = num ;
			int prevTotal = 0;
			int mul = 1;
			
			while(num>9) {
				int digits = num%10;
				int quotient = num/10;
				prevTotal += digits*mul;
				if(digits == 6) {
					int temp = (quotient*10*mul) + (prevTotal+ (3*mul));
					max = Math.max(max, temp);
				}
				num = quotient;
				mul = mul*10;
			}
			
			if(num == 6) {
				int temp = (9*mul) + (prevTotal);
				max = Math.max(max, temp);
			}
				
			return max;
			
		}
	}


