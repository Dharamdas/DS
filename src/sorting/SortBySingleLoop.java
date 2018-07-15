package sorting;

public class SortBySingleLoop {

	public static void main(String[] args) {

		//int arr[]={60,12,30,21,54,7,10,32,4,1,99};
		int arr[]={10,20,40,87,98,90,65,54,41,58};
		int n=arr.length;
		boolean again=false;
		System.out.println("Before Sortng:::");
		for(int t:arr)
			System.out.print(" "+t);

		int count=0;
		 for(int i=0;i<n-1;i++)
			{
			 if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
					again=true;
				}
			  
				if(i==n-2 && again==true)
				{
					i=0;
					again=false;
				}
				count++;
			}

		System.out.println(count);
		System.out.println("After Sortng:::");
		for(int t:arr)
			System.out.print(" "+t);
	}

}
