package gp;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingCharacters {

	public static void main(String[] args) {
		String word = "helloh";
		NonRepeatingCharacters characters = new NonRepeatingCharacters();
		char c = characters.firstNonRepeatingChar(word);
		System.out.println("First Non Repeating characters: "+c);
	//	char c1 = characters.firstRepeatingCharacter(word);
		//System.out.println("First Non Repeating characters: "+c1);
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
/*
	public char firstRepeatingCharacter(String word)
	{
		Set<Character> repeating = new HashSet<Character>();
        List<Character> nonRepeating = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);
            if (repeating.contains(letter))
            {
                continue;
            }
            if (nonRepeating.contains(letter)) 
            {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else 
            {
                nonRepeating.add(letter);
            }
        }
        
        return repeating.iterator().next();
	}
*/	
}
