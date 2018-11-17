package concurrency.semaphore.sharedcounter;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(1);
        SharedCounter counter = new SharedCounter(s);
        // Creating three threads
        Thread t1 = new Thread(counter, "Thread-A");
        Thread t2 = new Thread(counter, "Thread-B");
        Thread t3 = new Thread(counter, "Thread-C");
        t1.start();
        t2.start();
        t3.start();
    }
}
