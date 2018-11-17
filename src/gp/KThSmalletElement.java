package gp;

import java.util.Arrays;

public class KThSmalletElement {

    public static void main(String[] args) {
        Integer arr[] = new Integer[]{12, 3, 5, 7, 4, 19, 26};
        int k = 2;
        System.out.println("Quick Select: "+kthSmallest(arr,0,arr.length-1,k));
        System.out.println("Using Sorting: "+kthSamlletUsingSorting(arr,k));
    }

    public static int kthSamlletUsingSorting(Integer arr[],int k){

        Arrays.sort(arr);

        return arr[k-1];
    }

    public static int kthSmallest(Integer[] arr, int l, int r, int k)
    {

        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= r - l + 1)
        {

            int pos = partition(arr, l, r);
            if(pos-l==k-1)
            {
                return arr[pos];
            }
            //left sub array
            if(pos-1>k-1)
            {
                return kthSmallest(arr,l,pos-1,k);
            }

            //right sub array
            return kthSmallest(arr,pos+1,r,k-pos-1+l);

        }
        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }

    /* Standard partition process of QuickSort.
     It considers the last element as pivot
     and moves all smaller element to left of
     it and greater elements to right*/
    public static int partition(Integer [] arr, int l, int r){

        int x = arr[r], i = l;

        for(int j=l;j<=r-1;j++)
        {
           if(arr[j]<=x){
               //Swap arr[i] and arr[j]
               int t=arr[i];
               arr[i]=arr[j];
               arr[j]=t;
               i++;
           }
        }
        //swap arr[i] and arr[r]
        int t=arr[i];
        arr[i]=arr[r];
        arr[r]=t;
        return i;

    }
}
