package concurrency.semaphore.pc;

import java.util.concurrent.Semaphore;

public class ConsumerProducer {
    public static void main(String[] args) {

        Semaphore producer= new Semaphore(4);
        Semaphore consumer = new Semaphore(0);
        System.out.println("semaphoreProducer permit=1 | semaphoreConsumer permit=0");

        Producer producer1= new Producer(producer,consumer);
        Consumer consumer1 = new Consumer(producer,consumer);

        Thread tproducer = new Thread(producer1,"Producer Thread");
        Thread tconsumer = new Thread(consumer1,"Consumer Thread");
        tproducer.start();
        tconsumer.start();

      //  System.out.println("Completed  Producing and Consuming");

    }
}
