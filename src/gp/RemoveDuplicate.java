package gp;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int array[] = { 1,2,2,3,4,4,5,5,6,7 };
		int arr[]={2,4,5,4,5,6,10,12,10,5,4};
		int arr1[]={1,1,2,2,3,3};
		//removeDuplciateWithTwoLoop(array);
		/*int n=removeDuplicateSortedArray(array);
		System.out.println(" Array Without Duplicate: ");
		for(int i=0;i<n;i++)
			System.out.print(" "+array[i]);*/
		System.out.println("Duplicate Count in sorted Array: "+removeDuplicateSortedArray(arr1));
		System.out.println("\nDuplicate Count in Unsorted Array: "+removeDuplicateUnSortedArray(arr));
		System.out.println("Distinct Count: "+printDistinct(arr1,arr1.length));
	}


	static int printDistinct(int arr[], int n)
	{
		int count=0;

		Set<Integer> set = new HashSet<>();

		// Pick all elements one by one
		for (int i = 0; i < n; i++)
		{
			// Check if the picked element
			// is already printed
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;

			// If not printed earlier,
			// then print it
			if (i == j){
				set.add(arr[i]);
				System.out.print( arr[i] + " ");
			}
		}
		 return set.size();
	}

	public static int removeDuplicateUnSortedArray(int arr[]){

			int noOfUniqueElements = arr.length;
			int count=0;
			for(int i=0;i<noOfUniqueElements;i++)
			{
				for(int j=i+1;j<noOfUniqueElements;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[i]=arr[noOfUniqueElements-1];
						noOfUniqueElements--;
						j--;
						count++;
					}
				}
			}

			for(int i=0;i<noOfUniqueElements;i++)
			{
				System.out.print(" "+arr[i]);
			}
		//System.out.println("Duplicate "+ count);

		return count;
	}

	public static int removeDuplicateSortedArray(int arr[]){
		int len=arr.length;
		int j=0;
		int tmp[] = new int[len+1];
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
				tmp[j++]=arr[i];
		}
		tmp[j++]=arr[len-1];

		for(int i=0;i<j;i++)
		    arr[i]=tmp[i];
		return j;
	}

}
