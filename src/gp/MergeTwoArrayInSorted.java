package gp;

import java.util.Arrays;

public class MergeTwoArrayInSorted {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		a = Arrays.copyOf(a, a.length*2);
		System.out.println("a+b Size: "+a.length);
		int b[]={3,4,5,6,7};
		int m=a.length-1;
		int n=b.length-1;
		int j=m;
		int i=n;
		for(int k=m;k>=0;k--)
		{
			if(b[i]>a[j] || j<0)
			{
			 a[k]=b[i];
			 i--; j--;
			 if(i<0)break;
			 
			}else
			{
				a[k]=a[j];
				j--;
			}
		}
		
		for(int v:a)
			System.out.print(v+" ");
		
	}

}
