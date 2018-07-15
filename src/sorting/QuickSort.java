package sorting;

public class QuickSort {
    static int a[]={10,2,6,1,8};
    public static void main(String[] args) {

        System.out.println("Before Sorting -----");
        for(int ele:a)
            System.out.print(" "+ele);

        quickSort(0,a.length-1);
        System.out.println("\n After Sorting -----");

        for(int ele:a)
            System.out.print(" "+ele);
    }

    public static void quickSort(int s,int e)
    {

        if(s<e)
        {
             int p=partition(s,e);
             quickSort(s,p-1);
             quickSort(p+1,e);
        }
    }



    private static int partition(int s, int e)
    {

        int i=s+1,j=s+1;
        int pivot=a[s];
        while(j<=e)
        {
            if(pivot>a[j])
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
            }
            j++;
        }
        i--;
        int t=a[i];
        a[i]=a[s];
        a[s]=t;

        return i;
    }
}
