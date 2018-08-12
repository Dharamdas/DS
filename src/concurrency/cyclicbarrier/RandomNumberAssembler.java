package concurrency.cyclicbarrier;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberAssembler implements Runnable {

    private List<RNG>  rngList;
    private List<Integer> totalGeneratedNumbers = new ArrayList<>();

    public RandomNumberAssembler(List<RNG> rngs){
        this.rngList=rngs;
    }

    @Override
    public void run(){

        System.out.println("Assembling RNG List");
        for(RNG rng:rngList)
        {
            for(Integer randomNumber:rng.getRandomNumberList())
            {
                System.out.println(randomNumber);
                totalGeneratedNumbers.add(randomNumber);
            }
            System.out.println("T");
        }
        System.out.println("Random List :"+totalGeneratedNumbers);

    }


}
