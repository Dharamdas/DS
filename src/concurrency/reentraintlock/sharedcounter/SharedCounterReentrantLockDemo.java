package concurrency.reentraintlock.sharedcounter;

import java.util.concurrent.locks.ReentrantLock;

public class SharedCounterReentrantLockDemo {

    public static void main(String[] args) {
        ReentrantLock rLock = new ReentrantLock();
        Thread t1 = new Thread(new Counter("Thread-1", rLock));
        Thread t2 = new Thread(new Counter("Thread-2", rLock));
        System.out.println("starting threads ");
        t1.start();
        t2.start();
    }
}
