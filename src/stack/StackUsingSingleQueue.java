package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

    Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String[] args) {
        StackUsingSingleQueue s = new StackUsingSingleQueue();

        s.push(20);
        s.push(40);
        s.push(50);
        System.out.println("Poped Elemet: "+s.pop());

    }

    // Push operation
    void push(int val)
    {
        // get previous size of queue
        int size = q.size();

        //add current element
        q.add(val);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element

        for(int i=0;i<size;i++)
        {
            int x=q.remove();
            q.add(x);
        }

    }

    // Removes the top element
    int pop()
    {
        if(q.isEmpty()){
            System.out.println("No Element ");
            return -1;
        }
        int x=q.remove();
        return x;
    }

    // Returns top of stack
    int top()
    {
        if (q.isEmpty())
            return -1;
        return q.peek();
    }


    // Returns true if Stack is empty else false
    boolean isEmpty()
    {
        return q.isEmpty();
    }

}
