package concurrency.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class RNG implements Runnable {

private Random random = new Random();
private int start_number;
private int end_number;
private CyclicBarrier cyclicBarrier;
private List<Integer> randomNumberList = new ArrayList<>();

    public List<Integer> getRandomNumberList() {
        return randomNumberList;
    }

    public RNG(int start_number,int end_number, CyclicBarrier cyclicBarrier){

        this.start_number=start_number;
        this.end_number=end_number;
        this.cyclicBarrier=cyclicBarrier;
    }


    @Override
    public void run(){


        randomNumberList.clear();

        for(int i=start_number;i<=end_number;i++)
        {
            randomNumberList.add(i);
        }
        try{
            cyclicBarrier.await();
        }catch (Exception e)
        {
        randomNumberList.clear();
        }

    }
}
