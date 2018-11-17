package test;

import java.util.Arrays;

public class MaxTringularSequence {

    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        int arr1[]={9,19,8,10,13};
        System.out.println("Total number of triangles is " +
                isPossibleTriangle(arr1,arr1.length));
        System.out.println("Total number of triangles is " +
                findNumberOfTriangles(arr1));
    }


    static int findNumberOfTriangles(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n-2; ++i)
        {
            int k = i + 2;
            for (int j = i+1; j < n; ++j)
            {
                while (k < n && arr[i] + arr[j] > arr[k])
                    ++k;


                if(k>j)
                    count += k - j - 1;
            }
        }
        return count;
    }

    static boolean isPossibleTriangle(int []arr,
                                      int N)
    {
        int count=0;
        boolean flag=false;
        // If number of elements are
        // less than 3, then no
        // triangle is possible
        if (N < 3)
            return false;

        // first sort the array
        Arrays.sort(arr);

        // loop for all 3
        // consecutive triplets
        for (int i = 0; i < N - 2; i++)

            // If triplet satisfies
            // triangle condition, break
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                count++;
              flag= true;

            }

        System.out.println(count);
        return flag;
    }
}
