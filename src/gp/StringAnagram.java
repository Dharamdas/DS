package gp;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="abcd";
		String str2="cdabs";
		boolean flag=true;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] arr=str1.toCharArray();
		for(char c:arr)
		{
			map.put(c,1);
		}
		
		char[] arr1 = str2.toCharArray();
		for(char c:arr1)
		{
			if(!map.containsKey(c))
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("String is anagram::::");
		}else
		{
			System.out.println("String is not anagram");
		}
	}
}
