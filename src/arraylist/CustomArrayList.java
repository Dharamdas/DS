package arraylist;

import java.util.Arrays;

public class CustomArrayList<E> {

    private Object elementList[];
    private int initialCapacity=5;
    private int size;
    private int threshhold=2;

    CustomArrayList()
    {
        elementList = new Object[this.initialCapacity];
        this.size=0;
    }
    CustomArrayList(int initialCapacity)
    {
        this.initialCapacity=initialCapacity;
        elementList = new Object[this.initialCapacity];
        this.size=0;
    }

    private boolean isFull(){
        return size==initialCapacity;
    }
    public void add(E element){

        ensureCapacity();
        elementList[size++]=element;
    }

    private void ensureCapacity(){
        if(isFull())
        {
            int newCapacity = size*threshhold;
            initialCapacity=newCapacity;
         elementList = Arrays.copyOf(elementList,newCapacity);
        }
    }

    public E get(int index)
    {
        if(index>size || index<0)
            throw new ArrayIndexOutOfBoundsException("index "+index+" array size "+size);
        return (E)elementList[size];
    }
    public E remove(int index){
        if(index>size || index<0)
            throw new ArrayIndexOutOfBoundsException("index "+index+" array size "+size);
        return (E)elementList[size--];
    }

    public int size(){
        return size;
    }

    public void display(){
        System.out.print("[");
        for(int i=0;i<size;i++)
            System.out.print(" "+elementList[i]);
        System.out.print("]");
    }

}
