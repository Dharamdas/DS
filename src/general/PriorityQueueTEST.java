package general;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTEST {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(20);
        q.add(40);
        q.add(1);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.add(8);
        q.add(2);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);



    }
}
