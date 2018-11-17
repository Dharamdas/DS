package concurrency.exchange;

import java.util.concurrent.Exchanger;

public class ConsumerThread implements Runnable {
    String str;
    Exchanger<String> ex;
    ConsumerThread(Exchanger<String> ex){
        this.ex = ex;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i ++){
            try {
                // Getting string from producer thread
                // giving empty string in return
                str = ex.exchange(new String());
                System.out.println("Got from Producer " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
