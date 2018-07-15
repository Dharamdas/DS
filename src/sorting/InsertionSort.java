package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[]={60,12,30,21,54,7,10,32,4,1,99,32};
		int i,j=0;
		int temp=0;
		System.out.println("before Sorting the Element: ");
		for(int t:arr)
			System.out.print(" "+t);
		for(i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>=temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		System.out.println();
		System.out.println("After Sorting the Element: ");
		for(int t:arr)
			System.out.print(" "+t);
	}

}
