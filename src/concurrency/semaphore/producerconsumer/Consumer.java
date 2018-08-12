package concurrency.semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Semaphore semaphoreConsumer;
    private Semaphore semaphoreProducer;


    public Consumer(Semaphore semaphoreProducer,Semaphore semaphoreConsumer){
    this.semaphoreConsumer=semaphoreConsumer;
    this.semaphoreProducer=semaphoreProducer;
    }

    @Override
    public void run(){

        try{
            for(int i=0;i<5;i++)
            {
                semaphoreConsumer.acquire();
                System.out.println("Consumed: "+i);
                semaphoreProducer.release();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
