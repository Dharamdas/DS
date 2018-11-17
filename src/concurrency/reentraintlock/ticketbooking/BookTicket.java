package concurrency.reentraintlock.ticketbooking;

import java.util.concurrent.locks.ReentrantLock;

public class BookTicket implements Runnable {
    private int available_ticket=20;
    private ReentrantLock lock;



    public BookTicket(ReentrantLock lock){
        this.available_ticket=available_ticket;
        this.lock=lock;
    }


    @Override
    public void run(){

        System.out.println("Waiting to book ticket for "+Thread.currentThread().getName());
        lock.lock();

        if(available_ticket>0)
        {
            System.out.println("Booking ticket for : "+ Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }finally {
                available_ticket--;
                System.out.println("Queue Length is:"+lock.getQueueLength());
            }
        }else{
            System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
