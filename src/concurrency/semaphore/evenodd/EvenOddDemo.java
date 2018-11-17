package concurrency.semaphore.evenodd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddDemo {

    public static void main(String[] args) {

        SharedPrinter sp = new SharedPrinter();
        //Starting two threads

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new EvenNumberProducer(sp,10));
        executorService.execute(new OddNumberProducer(sp,10));
        executorService.shutdown();


    }
}
