package concurrency.exchange;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {

    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<String>();
        // Starting two threads
        new Thread(new ProducerThread(ex)).start();
        new Thread(new ConsumerThread(ex)).start();
    }
}
