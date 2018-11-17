package concurrency.semaphore.sharedcounter;

import java.util.concurrent.Semaphore;

public class SharedCounter implements Runnable{

    private int c = 0;
    private Semaphore s;
    SharedCounter(Semaphore s){
        this.s = s;
    }


    @Override
    public void run() {
        try {

            // acquire method to get one permit
            s.acquire();
            this.increment();
            System.out.println("Value for Thread After increment - " + Thread.currentThread().getName() + " " + this.getValue());

           // this.decrement();
            //System.out.println("Value for Thread at last " + Thread.currentThread().getName()
              //      + " " + this.getValue());

            // releasing permit
            s.release();

        }catch (InterruptedException | RuntimeException  ex)
        {
            ex.printStackTrace();
        }

    }

    // incrementing the value
    public void increment() {
        try {
            // used sleep for context switching
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }

    // decrementing the value
    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }
}
