package queue;

public class ArrayCircularQueue {

   private int front,rare;
    private int capacity;
    private int [] array;

    ArrayCircularQueue(int size){
        this.front=-1;
        this.rare=-1;
        this.capacity=size;
        array = new int[size];
    }

    ArrayCircularQueue(){
        this.front=-1;
        this.rare=-1;
        this.capacity=5;
        array = new int[capacity];
    }

    public boolean isEmpty(){
        return (front==-1 && rare==-1);
    }

    public boolean isFull(){
        return (rare+1)%capacity==front;
    }

    public void enQueue(int data){
            insureCapacity();
            rare=(rare+1)%capacity;
            array[rare]=data;
            if(front==-1)
                front=rare;
    }
    public int getQueueSize()
    {
        return (capacity-front+rare+1)%capacity;
    }

    public int deQueue(){
        int data=0;
        if(isEmpty())
        {
            System.out.println("Qeueue is Empty");
            return -1;
        }else
            {
            data =array[front];
            if(front==rare)
                front=rare=-1;
            else{
                front=(front+1)%capacity;
            }
        }

        return data;
    }

    public void insureCapacity(){

        if(isFull()) {

            int initialCapacity = capacity;
            capacity *= 2;
            int[] oldArray = array;
            array = new int[capacity * 2];
            for (int i = 0; i < oldArray.length; i++) {
                array[i] = oldArray[i];
            }
            System.out.println("Front -> " + front + " rare -> " + rare + " Capacity- > " + capacity);
            if (rare < front) {
                for (int i = 0; i < front; i++) {
                    array[i + initialCapacity] = this.array[i];
                    array[i] = 0;
                }
                rare = rare + initialCapacity;
            }
        }
    }


    public void getList(){
        int i=front;
        while (i!=rare+1)
        {
            System.out.println(" "+array[i]);
            i++;
        }
    }

}
