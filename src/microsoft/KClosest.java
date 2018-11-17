package microsoft;
/*
The time complexity of this method is O(Logn + k).
 */
public class KClosest {
    /* Driver program to check above functions */
    public static void main(String args[]) {
        KClosest ob = new KClosest();
        int arr[] = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56
        };
        int n = arr.length;
        int x = 35, k = 4;
        ob.printKclosest(arr, x, 4, n);
    }

    void printKclosest(int arr[], int x, int k, int n) {

        // Find the crossover point
        int l = findCrossOver(arr, 0, n-1, x);
        System.out.println("Crossover Point: "+l);
        int r = l+1;   // Right index to search
        int count = 0;

        if (arr[l] == x)
            l--;
        // Compare elements on left and right of crossover
        // point to find the k closest elements

        while(l>=0 && r<n && count<k)
        {
            if(x-arr[l] < arr[r]-x)
                System.out.print(arr[l--]+" ");
            else
                System.out.print(arr[r++]+" ");
            count++;
        }

        // If there are no more elements on right side, then
        // print left elements
        while (count < k && l >= 0)
        {
            System.out.print(arr[l--]+" ");
            count++;
        }
        // If there are no more elements on left side, then
        // print right elements
        while (count < k && r < n)
        {
            System.out.print(arr[r++]+" ");
            count++;
        }

    }

    int findCrossOver(int arr[], int low, int high, int x) {

        if (arr[high] <= x) // x is greater than all
            return high;
        if (arr[low] > x)  // x is smaller than all
            return low;


        // Find the middle point
        int mid = (low + high)/2;

        /* If x is same as middle element, then return mid */
        if (arr[mid] <= x && arr[mid+1] > x)
            return mid;

        if(arr[mid] < x)
            return findCrossOver(arr, mid+1, high, x);
        else
            return findCrossOver(arr, low, mid - 1, x);
    }
}