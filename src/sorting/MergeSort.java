package sorting;

public class MergeSort {

	
	public static void main(String[] args) {

	int arr[]={10,60,20,5,8,80,19};
	int temp[]  = new int[arr.length];
	MergeSort m = new MergeSort();
	System.out.println("Array Size "+(arr.length-1));
	m.mergerSort(arr,temp,0,arr.length-1);
	for(int val : temp){
		System.out.print(val+" ");
	}
	}
	
	public void mergerSort(int arr[],int temp[],int left,int right)
	{
		if(left<right){
		int mid = (left+right)/2;
		mergerSort(arr, temp, left, mid);
		mergerSort(arr, temp, mid+1, right);
		merge(arr,temp,left,mid+1,right);
		}
	}
	
	public void merge(int arr[],int temp[],int left,int mid,int right){
		int size=0;
		int temp_pos=left;
		int left_end=mid-1;
		size= right-left+1;
		
		while((left<=left_end) && (mid<=right))
		{
			if(arr[left]<=arr[mid]){
				temp[temp_pos]=arr[left];
				temp_pos++;
				left++;
			}else{
				temp[temp_pos]=arr[mid];
				temp_pos++;
				mid++;
				
			}
		}
			while(left<=left_end){
				temp[temp_pos] = arr[left];
				left++;
				temp_pos++;
			}
			while(mid<=right){
				temp[temp_pos]=arr[mid];
				temp_pos++;mid++;
			}

			for(int i=0;i<size;i++)
			{
				arr[right]=temp[right];
				right--;
			}
	}

}
