package concurrency.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*


The task is to generate 20 random numbers twice.
This task is divided within 4 threads where each thread generates 5 random numbers.
After all the threads have completed execution,
the RandomNumberAssembler gets the random numbers generated by all threads and prints them
 */
public class CyclicBarrierDemo {


    public static void main(String[] args) {


        //generate 20 random numbers using 4 threads twice
        final int THREAD_COUNT = 4;
        final int RANDOM_NUMBER_PER_THREAD_COUNT = 5;
        final int TASK_COUNT = 2;


        List<RNG> rngs = new ArrayList<RNG>();
        RandomNumberAssembler assembler = new RandomNumberAssembler(rngs);

        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT,assembler);

       // for(int i=1; i <= THREAD_COUNT; i++) {
         //   rngs.add(new RNG(i,5, barrier));
       // }
        rngs.add(new RNG(1,5, barrier));
        rngs.add(new RNG(6,11, barrier));
        rngs.add(new RNG(12,15, barrier));
        rngs.add(new RNG(16,20, barrier));
        ExecutorService service =  Executors.newFixedThreadPool(THREAD_COUNT);

        for (int k=1; k <= TASK_COUNT; k++) {
            for(int i=1; i <= THREAD_COUNT; i++) {
                service.submit(rngs.get(i-1));
            }
        }
        service.shutdown();

    }
}
