package concurrency.semaphore.evenodd;

import java.util.concurrent.Semaphore;

public class SharedPrinter {


    boolean evenFlag=false;

    //2 Semaphore

    Semaphore evenSemaphore = new Semaphore(0);
    Semaphore oddSemaphore = new Semaphore(1);

    public void printEvenNumber(int num){

        try {
            evenSemaphore.acquire();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(num);
        oddSemaphore.release();

    }

    public void printOddNumber(int num){
        try {

            oddSemaphore.acquire();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(num);
        evenSemaphore.release();
    }
}
