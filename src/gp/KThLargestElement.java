package gp;

import java.util.IdentityHashMap;
import java.util.PriorityQueue;

public class KThLargestElement {
    public static void main(String[] args) {

        Integer arr[] = new Integer[]{15,5,10,10,20,10,20};
        int k = 3;
        System.out.println(findKthLargest(arr,k));

        IdentityHashMap i = new IdentityHashMap();


    }

    public static int findKthLargest(Integer[] nums, int k) {
        PriorityQueue<Integer>  q = new PriorityQueue<>();
        for(int num:nums)
        {
            if(!q.contains(num))
            {
                q.offer(num);
                 System.out.println("Queue: "+q);
            }
            if(q.size()>k)
            {
                System.out.println("Removed: "+q.poll());
            }
        }
        System.out.println("Final Queue: "+q);
        return q.peek();
    }
}
