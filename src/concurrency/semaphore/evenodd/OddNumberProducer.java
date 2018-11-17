package concurrency.semaphore.evenodd;

public class OddNumberProducer implements Runnable{
    SharedPrinter sharedPrinter;
    int index;

    OddNumberProducer(SharedPrinter printer,int index){

        this.sharedPrinter=printer;
        this.index=index;
    }

    @Override
    public void run() {

        for(int i=1;i<=index;i=i+2)
        {
            sharedPrinter.printOddNumber(i);
        }
    }
}
