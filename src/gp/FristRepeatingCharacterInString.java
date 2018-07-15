package gp;

import java.util.ArrayList;

public class FristRepeatingCharacterInString {

	public static void main(String[] args) {
		String word = "ohellohe";
		char[] str = word.toCharArray();
		ArrayList<Character> charlist = new ArrayList<Character>();
		char repeating = 0;
		
	    for(int i=str.length-1;i>=0;i--)
	    {
	    	if(charlist.contains(str[i]))
	    	{
	    		repeating = str[i];
	    	}else{
	    		charlist.add(str[i]);
	    	}
	    }
	    System.out.println(repeating);

	}
}
