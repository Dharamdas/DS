package sorting;

public class CountSort012 {

    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr[] = {0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1};
        int arr1[] = {0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1};
        int a_size = a.length;
        sort012(a, a_size);
        System.out.println("Array after seggregation 0 1 2 ");
        printArray(a, a_size);
        sort01(arr);
        System.out.println("Array after seggregation 0 1  ");
        printArray(arr, arr.length);
        sortArrayUsingCount(arr1);
        System.out.println("Array after seggregation 0 1 Using count Method ");
    }

    static void sort01(int arr[])
    {
        int len =arr.length-1;
        int j=-1;
        for(int i=0;i<=len;i++)
        {
            if(arr[i]<1)
            {
                j++;
                int t = arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
    }

    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0,temp=0;
        while (mid <= hi)
        {
            switch (a[mid])
            {
                case 0:
                {
                    temp   =  a[lo];
                    a[lo]  = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    public static void sortArrayUsingCount(int arr[])
    {
        int left=0,right=arr.length-1;
        for(int t:arr)
            System.out.print(" "+t);

        while(left<right)
        {
            while(arr[left]==0 && left<right)
            {
                arr[left]=0;
                left++;
            }
            while(arr[right]==1 && right>left)
            {
                arr[right]=1;
                right--;
            }
            if(left<right)
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }

        }

        printArray(arr,arr.length);
    }


    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
}
