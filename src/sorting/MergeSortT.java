package sorting;

public class MergeSortT {

    public static void main(String[] args) {

        int a[]={4,2,1,3,5};
        mergeSort(a,0,a.length-1);
        for(int ele:a)
            System.out.print(" "+ele);
    }


        static void mergeSort(int[] a,int low,int high)
        {
            if(low<high)
            {
                int mid = (low + high)/2;
                mergeSort(a,low,mid);
                mergeSort(a,mid+1,high);
                merge(a,low,mid,high);
            }
        }
        static void merge(int []a,int s,int m,int e)
        {
            int n=e-s+1;
            int[] temp =new int[n];
            int i=s ,j=m+1;
            int k=0;
            while(i<=m && j<=e)
            {
                if(j>e)
                    temp[k++]=a[i++];
                else if(i>m)
                    temp[k++]=a[j++];
                else if(a[i]<a[j])
                    temp[k++]=a[i++];
                else
                    temp[k++]=a[j++];
            }
            for(int k1=0;k1<k;k1++)
            {
                a[s+k1]=temp[k1];
            }
        }

}
