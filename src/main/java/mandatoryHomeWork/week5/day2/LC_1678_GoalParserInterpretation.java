package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class LC_1678_GoalParserInterpretation {
	
	@Test
	public void tc1()
	{
		 String command = "G()(al)"; 
		 
		 System.out.println( interpret(command));
				 
	}
	

	@Test
	public void tc2()
	{
		 String command = "G()()()()(al)"; 
		 
		 System.out.println( interpret(command));
				 
	}
	

	@Test
	public void tc3()
	{
		 String command = "(al)G(al)()()G"; 
		 
		 System.out.println( interpret(command));
				 
	}
	
	public String interpret(String command) {
		StringBuilder S = new StringBuilder(command.length());
		for(int i = 0 ; i < command.length() ; i++){
			if(command.charAt(i)=='G') S.append('G');
			if(command.charAt(i)=='('){
				if(command.charAt(i+1)==')') {S.append('o'); i++;}
				else{S.append("al"); i = i + 3;}
			}
		}
		return S.toString();
	}

}
