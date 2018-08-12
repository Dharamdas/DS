package concurrency.BlockingQueueproducerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer  implements Runnable{

    private BlockingQueue blockingQueue;
    private int count;
    Producer(BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;

    }

    @Override
    public void run(){


            try{
                for (int i=0;i<10;i++)
                {
                    Thread.sleep(1000);
                    blockingQueue.put(i);
                    System.out.println("Producing: "+i);

                }

            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
}
