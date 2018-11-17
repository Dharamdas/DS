package concurrency.reentraintlock.sharedcounter;

import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {

    private ReentrantLock lock;
    private String threadName;

    Counter(String threadName,ReentrantLock reentrantLock){
        this.threadName=threadName;
        this.lock=reentrantLock;

    }
    @Override
    public void run() {

        System.out.println("In Counter run method, thread " + threadName
                + " is waiting to get lock");


        lock.lock();

            System.out.println("Thread " + threadName + " has got lock");
            SharedResource.count++;
            System.out.println("Thread " + threadName + " Count " + SharedResource.count);
        try{
            Thread.sleep(500);
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("Thread " + threadName + " releasing lock");
            lock.unlock();
        }
    }
}
