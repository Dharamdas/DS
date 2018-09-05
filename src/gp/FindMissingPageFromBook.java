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
		
		int pages[]={1,2,3,4,5,6,7,9,10}; // 8 missing
		int EvenSeries[]={2,4,6,8,10,12,16,18};  // 14 missing
		int oddSeries[]={1,3,5,7,9,11,15,17,19}; // 7 Missing
		System.out.println("findMissingPage:: "+findMissingPage(pages));
		System.out.println("findMissingPageWithEvenNo: "+findMissingPageWithEvenNo(EvenSeries));
		System.out.println("findMissingPageWithOddNo: "+findMissingPageWithOddNo(oddSeries));
	}

	public static int findMissingPageWithOddNo(int pages[])
	{

		int bookSize = pages.length;
		int totalSumOfPages = ((bookSize)* (bookSize+2))+1;

		System.out.println("Total sum: "+totalSumOfPages+"  "+bookSize);
		for(int page:pages)
		{
			totalSumOfPages = totalSumOfPages-page;
		}
		return totalSumOfPages;
	}
	public static int findMissingPageWithEvenNo(int pages[])
	{

		int bookSize = pages.length;
		int totalSumOfPages = ((bookSize+1)* (bookSize+2));

		System.out.println("Total sum: "+totalSumOfPages+"  "+bookSize);
		for(int page:pages)
		{
			totalSumOfPages = totalSumOfPages-page;
		}
		return totalSumOfPages;
	}
	
	public static int findMissingPage(int pages[])
	{
		
		int bookSize = pages.length;
	    int totalSumOfPages = ((bookSize+1)* (bookSize+2))/2;
	    
	    System.out.println("Total sum: "+totalSumOfPages+"  "+bookSize);
	    for(int page:pages)
	    {
	    	totalSumOfPages = totalSumOfPages-page;
	    }
		return totalSumOfPages;
	}
}
