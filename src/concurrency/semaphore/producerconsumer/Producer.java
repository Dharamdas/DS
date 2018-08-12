package concurrency.semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;


    Producer(Semaphore semaphoreProducer, Semaphore semaphoreConsumer){
        this.semaphoreConsumer=semaphoreConsumer;
        this.semaphoreProducer=semaphoreProducer;
    }

    @Override
    public void run(){

        try{

            for(int i=0;i<5;i++)
            {
                semaphoreProducer.acquire();
                System.out.println("Produce: "+i);
                semaphoreConsumer.release();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
