package concurrency.BlockingQueueproducerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue  blockingQueue;
    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;
    }


    @Override
    public void run(){
        try{
            while (true) {
                Thread.sleep(500);
                System.out.println("Consuming: " + blockingQueue.take());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
