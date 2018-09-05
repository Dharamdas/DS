package stack;

import java.util.Arrays;

public class CustomStack<E> {
    private Object stackList[];
    private int top;
    private int initialCapacity=10;
    CustomStack(){
        //Default Constructor
        stackList = new Object[initialCapacity];
        top=-1;
    }
    CustomStack(int initialCapacity)
    {
        this.initialCapacity=initialCapacity;
        stackList = new Object[initialCapacity];
        top=-1;
    }

    private boolean isFull(){
        return top==initialCapacity;
    }
    private void ensureCapacity(){
        if(isFull())
        {
            int newCapacity=initialCapacity*2;
            initialCapacity=newCapacity;
            stackList= Arrays.copyOf(stackList,newCapacity);
        }
    }

    public boolean isEmpty()
    {
        return top==-1;
    }
    public void push(E element){
        ensureCapacity();
        stackList[++top]=element;
    }
    public int size(){
        return top;
    }
    public E pop(){
        if(top==-1)
            throw new RuntimeException("Stack is Empty");
        return (E)stackList[top--];
    }
    public E peek(){
        if(top==-1)
            throw new RuntimeException("Stack is Empty");
        return (E)stackList[top];
    }

}
