package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]={60,12,30,21,54,7,10,32,4,1,99,32};
		int minElementIndex;
		boolean flag=false;
		System.out.println("Before Sorting ::");
		for(int t:arr)
			System.out.print(" "+t);
		
		for(int outer=0;outer<arr.length;outer++)
		{
			minElementIndex=outer;
			for(int inner=outer;inner<arr.length;inner++)
			{
				if(arr[inner]<arr[minElementIndex])
				{
					minElementIndex=inner;
					flag=true;
				}
			}
			if(flag)
			{
			/*	int t= arr[minElementIndex];
				arr[minElementIndex]=arr[outer];
				arr[outer]=t;
				flag=false;*/
				int t = arr[outer];
				arr[outer] = arr[minElementIndex];
				arr[minElementIndex]=t;
				flag=false;
			}
		}
		System.out.println();
		System.out.println("After Sorting the ElementS:::");
		for(int t:arr)
			System.out.print(" "+t);

	}
}
