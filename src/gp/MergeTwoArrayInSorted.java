package gp;

import java.util.Arrays;

public class MergeTwoArrayInSorted {

	public static void main(String[] args) {

		int a[] = {1,2,10,30,35,50};
		int b[]={3,4,5,6,7,90,100};
		int arr[] = new int[a.length+b.length];
		mergeSorrtedArray(a,b,arr,a.length,b.length);
		for(int n:arr)
			System.out.print(n+" ");
	}


	public static void mergeSorrtedArray(int[] a,int[] b,int[] c, int asize,int bsize){
		int i=0,j=0,k=0;

		while(i<asize && j<bsize)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		//store remaining element of first array

		while(j<bsize) {
			c[k++] = b[j++];
		}
		while(i<asize)
		{
			c[k++]=a[i++];
		}

	}
}
