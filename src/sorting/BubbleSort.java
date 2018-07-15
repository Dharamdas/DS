package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]={60,12,30,21,54,7,10,32,4,1,99,32};
		System.out.println("Before Sorting Elelements::::");
		for(int t:arr)
			System.out.print(" "+t);
		for(int outer=arr.length-1;outer>0;outer--)
		{
			for(int inner=0;inner<outer;inner++)
			{
				if(arr[inner]>arr[inner+1])
				{
					int t= arr[inner];
					arr[inner]=arr[inner+1];
					arr[inner+1]=t;
				}
			}
		}
		System.out.println();
		System.out.println("after Sorting the elements::::");
		for(int t:arr)
			System.out.print(" "+t);

	}
}
