package sorting;

import java.util.Arrays;

public class CountSort {


    public static void main(String[] args) {
        System.out.println("Counting sort in Java");
        int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
        int maxElement = findMaxElement(input);
        countSort(input,maxElement);
        System.out.println("\n"+Arrays.toString(input));
    }

    static int findMaxElement(int input[])
    {
        int max=0;
        for(int i=0;i<input.length;i++)
        {
            if(max<input[i])
                max=input[i];
        }
        return max;
    }
    static void countSort(int input [],int maxElement)
    {
        //create new array with max element+1 size
            int counter[]= new int[maxElement+1];

            //fill the bucket
        for(int i:input)
        {
            System.out.print(" "+i);
            counter[i]++;
        }

        printArray(counter,counter.length);

        int indx=0;
        for(int j=0;j<counter.length;j++)
        {
            while(counter[j]>0)
            {
                input[indx]=j;
                indx++;
                counter[j]--;
            }
        }

    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        System.out.println();
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }

}

