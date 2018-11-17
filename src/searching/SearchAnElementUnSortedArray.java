package searching;

import java.util.Arrays;

public class SearchAnElementUnSortedArray {

    public static void main(String[] args)
    {
        int arr[] = { 4, 6, 1, 5, 8 };
        int n = arr.length;
        int x = 1;
        System.out.println(search(arr, n, x));
    }

    static String search(int arr[], int n, int x)
    {
        // 1st comparison
        if (arr[n - 1] == x)
            return "Found";

        int backup = arr[n - 1];
        arr[n - 1] = x;

        for (int i = 0;; i++) {

            if (arr[i] == x) {
                System.out.println(i);
                if (i < n - 1)
                    return "Found";
                return "Not Found";
            }
        }
    }
}
