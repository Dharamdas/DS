package sorting;

import java.util.Comparator;
import java.util.Map.Entry;

public class ComparatorImpl implements Comparator<Entry<Integer,Integer>>
{
	/*
	@Override
	public int compare(Object o1, Object o2) {

		Object val =  ((Map.Entry)o1).getValue();
		Object val1 = ((Map.Entry)o2).getValue();
		
		return ((Comparable)val).compareTo(val1);
	}*/

	@Override
	public int compare(Entry<Integer,Integer> o1, Entry<Integer,Integer> o2) {

		Object val =  o1.getValue();
		Object val1 = o2.getValue();
		
		return ((Comparable)val).compareTo(val1);
	}
}
