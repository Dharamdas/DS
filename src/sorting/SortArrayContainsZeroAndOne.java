package sorting;

public class SortArrayContainsZeroAndOne {

	public static void main(String[] args) {

		int arr[] = {1,0,0,1,1,1,1,0,0,0,1,0,1,0,0,0,0};
		int left=0,right=arr.length-1;
		for(int t:arr)
			System.out.print(" "+t);
		while(left<right)
		{
			while(arr[left]==0 && left<right)
			{
				arr[left]=0;
				left++;
			}
			while(arr[right]==1 && right>left)
			{
				arr[right]=1;
				right--;
			}
			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int t:arr)
			System.out.print(" "+t);
	}
}
