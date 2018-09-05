package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]={60,12,30,21,54,7,10,32,4,1,99,32};
		int len=arr.length;
		System.out.println("Before Sorting ::");
		for(int t:arr)
			System.out.print(" "+t);
		
		for(int outer=0;outer<len;outer++)
		{
			for(int inner=outer;inner<len;inner++)
			{
				if(arr[inner]<arr[outer])
				{
					int t = arr[outer];
					arr[outer] = arr[inner];
					arr[inner]=t;
				}
			}

		}
		System.out.println();
		System.out.println("After Sorting the ElementS:::");
		for(int t:arr)
			System.out.print(" "+t);

	}
}
