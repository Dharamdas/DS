package gp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatingCharacters {

	public static void main(String[] args) {
		String word = "helloh";
		FirstNonRepeatingCharacters characters = new FirstNonRepeatingCharacters();
		char c = characters.firstNonRepeatingChar(word);
		System.out.println("First Non Repeating characters: "+c);
		char c1 = characters.firstRepeatingCharacter(word);
		System.out.println("First  Repeating characters: "+c1);
	}
	public char firstNonRepeatingChar(String word)
	{
		List<Character> nonrepeating = new ArrayList<Character>();
		char[] str = word.toCharArray();
		
		for(char c : str)
		{
			if(nonrepeating.contains(c))
			{
				nonrepeating.remove(new Character(c));
			}else
			{
				nonrepeating.add(c);
			}
		}
		System.out.println(nonrepeating);
		return nonrepeating.get(0);
	}

	public char firstRepeatingCharacter(String word)
	{
		Set<Character> repeating = new HashSet<Character>();
		Character repeatingChar=null;
		int len=word.length()-1;
        for (int i = len; i >=0 ; i--)
        {
            char letter = word.charAt(i);
            if (repeating.contains(letter))
            {
				repeatingChar=letter;
            }
            else{
				repeating.add(letter);
			}

        }
        
        return repeatingChar;
	}

}
