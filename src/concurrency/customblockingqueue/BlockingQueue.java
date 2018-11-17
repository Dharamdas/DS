package concurrency.customblockingqueue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<T> {

    private List<T> queue = new LinkedList<T>();
    private int queueLimit;


    BlockingQueue(){
        this.queueLimit=10;
    }

    BlockingQueue(int queueLimit){
        this.queueLimit=queueLimit;
    }


    public synchronized void put(T item)throws InterruptedException{

        while (queueLimit==queue.size())
            wait();
        if(queue.isEmpty())
            notifyAll();
        queue.add(item);
    }

    public synchronized T take()throws InterruptedException{

        while (queue.isEmpty())
            wait();

        if(queue.size()==queueLimit)
            notifyAll();

        return queue.remove(0);
    }


}
