package sorting;

import java.util.*;

public class FrequencySort {

	public static void main(String[] args) {

		int a[] = {5,4,3,2,1,0,5,3,40,2,40,4,1,2,3,5,3,40};
        
        System.out.println("Before Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
        sortByFreq(a);
        
        System.out.println("\nAfter Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sortByFreq(int a[]){
        Map<Integer, Integer> map = new TreeMap<Integer, Integer> ();
        
       /* Logic to place the elements to Map */
       for(int val : a){
    	   if(!map.containsKey(val)){
    		   map.put(val, 1);
    	   }else{
    		   map.put(val, map.get(val)+1);
    	   }
       }
       
       List list = new LinkedList(map.entrySet());
        System.out.println("Entry set returned Val: "+list);
       
       /* Sort the list elements based on frequency */
       Collections.sort(list, new ComparatorImpl());
       
       int count=0;
       
       /* Place the elements in to the array based on frequency */
       for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            
            int key = (Integer) entry.getKey();
            int val = (Integer) entry.getValue();
            
            for(int i=0; i < val; i++){
                a[count] = key;
                count++;
            }            
       } 
    }

}
