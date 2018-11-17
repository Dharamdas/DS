package concurrency.semaphore.evenodd;

public class EvenNumberProducer implements Runnable{
    SharedPrinter sharedPrinter;
    int index;

    EvenNumberProducer(SharedPrinter printer,int index){
        this.index=index;
        this.sharedPrinter=printer;
    }

    @Override
    public void run() {
        for(int i=2;i<=index;i=i+2)
        {
                sharedPrinter.printEvenNumber(i);
        }
    }
}
