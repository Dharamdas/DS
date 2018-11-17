package queue;

import java.util.Stack;

public class BuildQueueUsingStack {

    /* class of queue having two stacks */
    static class Queue
    {
        Stack<Integer> stack1 ;
        Stack<Integer> stack2 ;
    }

    /* Function to push an item to stack*/
    static void push(Stack<Integer> top_ref, int new_data)
    {
        //Push the data onto the stack
        top_ref.push(new_data);
    }


    /* Function to pop an item from stack*/
    static int pop(Stack<Integer> top_ref)
    {
        /*If stack is empty then error */
        if(top_ref.isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        //pop the data from the stack
        return top_ref.pop();
    }

    //Function to enqueue an item to the queue
    static void enQueue(Queue q, int x)
    {
        push(q.stack1,x);
    }

    /* Function to dequeue an item from queue */
    static int deQueue(Queue q)
    {
        int x=0;
        //if both stacks are empty then error
        if(q.stack1.empty() && q.stack2.empty())
        {
            System.out.println("Q is empty");
            System.exit(0);
        }

        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */

        if(q.stack2.empty())
        {
            while (!q.stack1.empty()){
                x=q.stack1.pop();
                push(q.stack2,x);
            }

        }
        x = pop(q.stack2);
        return x;
    }
}
