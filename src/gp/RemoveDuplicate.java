package gp;

import java.lang.reflect.Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int array[] = { 1,2,2,3,4,4,5,5,6,7 };
		int arr[]={2,4,5,4,5,6,10,12,10,5,4};
		//removeDuplciateWithTwoLoop(array);
		/*int n=removeDuplicateSortedArray(array);
		System.out.println(" Array Without Duplicate: ");
		for(int i=0;i<n;i++)
			System.out.print(" "+array[i]);*/
		removeDuplicateUnSortedArray(arr);
	}

	public static int removeDuplicateUnSortedArray(int arr[]){

			int noOfUniqueElements = arr.length;

			for(int i=0;i<noOfUniqueElements;i++)
			{
				for(int j=i+1;j<noOfUniqueElements;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[i]=arr[noOfUniqueElements-1];
						noOfUniqueElements--;
						j--;
					}
				}
			}

			for(int i=0;i<noOfUniqueElements;i++)
			{
				System.out.println(" "+arr[i]);
			}

		return 0;
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
