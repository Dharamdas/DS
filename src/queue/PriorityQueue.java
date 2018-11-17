package queue;

public class PriorityQueue {

    private int[] prioQueueAr;
    private int size;//Size of Queue
    private int number;  //holds number of elements in Priority Queue, initialized with 0 by default

    public PriorityQueue(int size){
        this.size = size;
        prioQueueAr = new int[this.size];
        number = 0;
    }

    public void insert(int value){

        int i;
        if(isFull()){
            System.out.println("Cannot insert "+value+", Queue is full");
        }

        if (number == 0)
            prioQueueAr[number++] = value; //If no values in PriorityQueue- insert at starting position, i.e. at 0th position
        else{
            for (i=number - 1; i>= 0; i--){
               if(value>prioQueueAr[i])
               {
                   prioQueueAr[i+1]=prioQueueAr[i];
               }else{
                   break;
               }
            }
            prioQueueAr[i++]=value;
            number++;
            }
    }



    public boolean isEmpty(){
        return (number == 0);
    }

    public boolean isFull(){
        return (number == size);
    }

}
