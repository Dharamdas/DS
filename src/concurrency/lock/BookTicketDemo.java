package concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookTicketDemo {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        BookTicket bookTicket=new BookTicket(lock);
        for(int i=1;i<=22;i++)
        {
            new Thread(bookTicket).start();
        }
    }
}
