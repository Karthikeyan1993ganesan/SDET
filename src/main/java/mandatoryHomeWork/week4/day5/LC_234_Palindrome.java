package mandatoryHomeWork.week4.day5;

public class LC_234_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "malayalamt";
		int mid=0;
		boolean flag=false;
		mid=s.length()/2;
	
		
		if(s.length()%2!=0)
		{
			int left=mid-1;
			int right= mid+1;
			
	
			while(left>=0)
			{
				
				if(s.charAt(left)==s.charAt(right))
				{
					System.out.println(s.charAt(left));
					System.out.println(s.charAt(right));
					left--;
					right++;
					flag=true;
				}
				else
					{flag=false;
					 break;
					}
			
				
			}
			
			
		}
		
		if(s.length()%2==0)
		{
			int l=mid-1;
			int r= mid;
			
		while(l>=0)
		{
			if(s.charAt(l)==s.charAt(r))
			{
				System.out.println(s.charAt(l));
				System.out.println(s.charAt(r));

				l--;
				r++;
				flag =true;
			}
			else
				{flag=false;
				break;
				}
		}
		}
		
		if(flag==true)
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
