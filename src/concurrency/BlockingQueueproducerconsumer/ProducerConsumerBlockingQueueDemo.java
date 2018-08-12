package concurrency.BlockingQueueproducerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerBlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue blockingQueue = new LinkedBlockingDeque();
        Producer producer=new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        Thread p = new Thread(producer);
        Thread c = new Thread(consumer);
        p.start();
        c.start();



    }
}
