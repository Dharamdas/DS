package gp;

public class FindLastOccuranceOfElemet {

	public static void main(String[] args) {

		int arr[] = {1,2,2,8,8,9,10,11,12};
		System.out.println("Size Of Array: "+arr.length);
		int lastOccur = 
		FindLastOccuranceOfElemet.findLastOccuranceOfElemet(arr,0,arr.length,8);
		System.out.println("Last Occurance: "+lastOccur);
	}
	public static int findLastOccuranceOfElemet(int arr[],int low,int high,int data){
		if(high>low){
			int mid = (high+low)/2;
			if( (mid==high && arr[mid]==data) || (arr[mid]== data && arr[mid+1]>data))
				return mid;
			//give preference to right half of the arry
			else if(arr[mid]<=data)
				return findLastOccuranceOfElemet(arr,mid+1,high,data);
			else
				return findLastOccuranceOfElemet(arr, low, mid-1, data);
		}
		return -1;
	}

}
