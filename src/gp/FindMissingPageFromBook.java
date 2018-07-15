package gp;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingPageFromBook {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+i;
		}
			System.out.println(sum);
		
		int pages[]={1,2,3,4,5,6,7,9,10};
		int count=10;
		System.out.println(findMissingPage(pages));
		//System.out.println(findMissingElelment(pages));
		printMissingNumber(pages,count);
		//usingInBuildClass(pages,count);
	}
	
	
	public static int findMissingPage(int pages[])
	{
		
		int bookSize = pages.length;
	    int totalSumOfPages = (bookSize+1)* (bookSize+2)/2;
	    
	    System.out.println("Total sum: "+totalSumOfPages+"  "+bookSize);
	    for(int page:pages)
	    {
	    	totalSumOfPages = totalSumOfPages-page;
	    }
		return totalSumOfPages;
	}

	public static void usingInBuildClass(int[] numbers, int count)
	{
		int totalMissingCount = count-numbers.length;
		System.out.println("Total Missing Count: "+totalMissingCount);
		BitSet bitSet = new BitSet(count);
		
		for(int num : numbers)
		{
			bitSet.set(num-1);
		}
		
		int missingIndex=0;
		
		for(int i=0;i<totalMissingCount;i++)
		{
			missingIndex = bitSet.nextClearBit(missingIndex);
			System.out.println(++missingIndex);
		}
	}
	
	
	//using bitset and finds when missing elements are more then one
	private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
 
    }
	
	//second method to do same
	
	public static int findMissingElelment(int pages[])
	{
		int first = pages[0];
		int second = 1;
		
		for(int i=1;i<pages.length;i++)
		{
			first = first ^pages[i];
		}
		for(int i=2;i<=pages.length+1;i++)
		{
			second = second ^i;
		}
		System.out.println("Frist: "+first +" Second: "+second);
		return first^second;
	}
	
}
