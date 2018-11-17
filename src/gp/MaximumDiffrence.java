package gp;

public class MaximumDiffrence {

    int maxDiff(int arr[], int arr_size)
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++)
        {
            for (j = i + 1; j < arr_size; j++)
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }


    int maxDiff1(int arr[], int n)
    {
        // Create a diff array of size n-1. The array will hold
        //  the difference of adjacent elements
        int diff[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            diff[i] = arr[i + 1] - arr[i];

        // Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < n - 1; i++)
        {
            if (diff[i - 1] > 0)
                diff[i] += diff[i - 1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }
        return max_diff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        MaximumDiffrence maxdif = new MaximumDiffrence();
        int arr[] = {1, 2, 90, 10, 110};
        int a[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("Maximum differnce is " +
                maxdif.maxDiff(arr, 5));
        System.out.println("Maximum differnce is " +
                maxdif.maxDiff1(a,a.length ));
    }
}


/*

Maximum difference is 109
Time Complexity : O(n^2)
Auxiliary Space : O(1)
 */

